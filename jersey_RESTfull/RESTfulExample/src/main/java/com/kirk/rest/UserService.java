package com.kirk.rest;

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

    UserDao userDao = new UserDao();

    @GET
    @Path("/users")
    @Produces(MediaType.APPLICATION_XML)
    public List<User> getUsers(){
        return userDao.getAllUsers();
    }
}
