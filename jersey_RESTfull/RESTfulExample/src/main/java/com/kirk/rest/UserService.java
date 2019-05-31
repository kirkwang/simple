package main.java.com.kirk.rest;

/**
 * Created by kewang on 1/12/16.
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/UserService")
public class UserService {

    main.java.com.kirk.rest.UserDao userDao = new main.java.com.kirk.rest.UserDao();

    @GET
    @Path("/users")
    @Produces(MediaType.APPLICATION_XML)
    public List<main.java.com.kirk.rest.User> getUsers() {
        return userDao.getAllUsers();
    }
}
