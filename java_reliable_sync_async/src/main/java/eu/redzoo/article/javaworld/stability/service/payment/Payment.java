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

import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
public class Payment {

    private String id;
    private boolean isDelayed;
    

    public Payment() {
    }
    
    
    public Payment(String id, boolean isDelayed) {
        this.id = id;
        this.isDelayed = isDelayed;
    }
    
    
    public void setId(String id) {
        this.id = id;
    }

    public void setDelayed(boolean isDelayed) {
        this.isDelayed = isDelayed;
    }


    public String getId() {
        return id;
    }
    
    public boolean isDelayed() {
        return isDelayed;
    }
}
