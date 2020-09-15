package com.jerseytest.jerseytest;

import org.springframework.stereotype.Component;

@Component
public class NiceGreetingService implements GreetingService {

    @Override
    public String getGreeting(String name) {
        return "Hello " + name + "!";
    }
}