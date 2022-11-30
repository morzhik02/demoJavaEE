package com.example.demojavaee;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;

import static jakarta.ws.rs.core.MediaType.APPLICATION_JSON;

@Controller
@Path("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GET
    @Produces(APPLICATION_JSON)
    public List<User> getUsers(){
        return userService.getAll();
    }
}
