package com.springdemo.spring.controller;

// Import Spring Web annotations
import org.springframework.web.bind.annotation.*;
import com.springdemo.spring.model.User;

@RestController
@RequestMapping("/hellomessage")
public class HelloMessageRestController {

    // Handles requests to /, /hello, or /hello/home
    @RequestMapping(value = {"", "/",})
    public String sayHello() {

        // Returns a simple greeting
        return "Hello Message From BridgeLabz!!";
    }

}