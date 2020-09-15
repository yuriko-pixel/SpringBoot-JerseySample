package com.jerseytest.jerseytest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;

@Path("greeting")
public class GreetingResource {

    private GreetingService greetingService;

    @Autowired
    public GreetingResource(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GET
    public String getGreeting(@QueryParam("name") String name) {
        return this.greetingService.getGreeting(name);
    }
}