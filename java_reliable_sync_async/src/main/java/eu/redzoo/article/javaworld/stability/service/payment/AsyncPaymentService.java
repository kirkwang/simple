/*
 * Copyright (c) 2014 Gregor Roth
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package eu.redzoo.article.javaworld.stability.service.payment;


import com.google.common.collect.ImmutableSet;
import eu.redzoo.article.javaworld.stability.service.scoring.Score;
import eu.redzoo.article.javaworld.stability.utils.jaxrs.client.Java8Client;
import eu.redzoo.article.javaworld.stability.utils.jaxrs.client.ResultConsumer;
import eu.redzoo.article.javaworld.stability.utils.jaxrs.client.circuitbreaker.ClientCircutBreakerFilter;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.grizzly.connector.GrizzlyConnectorProvider;

import javax.inject.Singleton;
import javax.ws.rs.*;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.MediaType;
import java.net.URI;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import static eu.redzoo.article.javaworld.stability.service.payment.PaymentMethod.*;


@Singleton
@Path("/")
public class AsyncPaymentService {

    private static final URI creditScoreURI = URI.create("http://localhost:9080/service/rest/creditscores");
    private final static Function<Score, ImmutableSet<PaymentMethod>> SCORE_TO_PAYMENTMETHOD = score -> {

        switch (score) {
            case POSITIVE:
                return ImmutableSet.of(CREDITCARD, PAYPAL, PREPAYMENT, INVOCE);
            case NEGATIVE:
                return ImmutableSet.of(PREPAYMENT);
            default:
                return ImmutableSet.of(CREDITCARD, PAYPAL, PREPAYMENT);
        }
    };
    private final Java8Client client;

    // ...
    private final AsyncPaymentDao paymentDao;


    public AsyncPaymentService() {
        ClientConfig clientConfig = new ClientConfig();                    // jersey specific
        clientConfig.connectorProvider(new GrizzlyConnectorProvider());    // jersey specific

        //...

        // use extended client (JAX-RS 2.0 client does not support CompletableFutures)
        client = Java8Client.newClient(ClientBuilder.newClient(clientConfig));
        client.register(new ClientCircutBreakerFilter());


        paymentDao = new PaymentDaoImpl();
    }

    @Path("paymentmethods")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public void getPaymentMethodsAsync(@QueryParam("addr") String address, @Suspended AsyncResponse resp) {
        paymentDao.getPaymentsAsync(address, 50)
                .thenCompose(pmts -> pmts.isEmpty()
                        ? client.target(creditScoreURI).queryParam("addr", address).request().async().get(Score.class)
                        : CompletableFuture.completedFuture((pmts.stream().filter(pmt -> pmt.isDelayed()).count() > 1) ? Score.NEGATIVE : Score.POSITIVE))
                .exceptionally(error ->
                        Score.NEUTRAL)
                .thenApply(SCORE_TO_PAYMENTMETHOD)
                .whenComplete(ResultConsumer.write(resp));  // writes result/error into async response
    }


    @Path("payments/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public void getPaymentAsync(@PathParam("id") String id, @Suspended AsyncResponse resp) {

        paymentDao.getPaymentAsync(id)
                .thenApply(optionalPayment -> optionalPayment.<NotFoundException>orElseThrow(NotFoundException::new))
                .whenComplete(ResultConsumer.write(resp));
    }
}
