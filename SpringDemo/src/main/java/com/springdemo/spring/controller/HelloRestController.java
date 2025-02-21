package com.springdemo.spring.controller;

// Import Spring Web annotations
import org.springframework.web.bind.annotation.*;
import com.springdemo.spring.model.User;


@RestController
@RequestMapping("/hello") // Base URL mapping for all methods in this controller

public class HelloRestController {

    // Handles requests to /, /hello, or /hello/home
    @RequestMapping(value = {"", "/", "/home", "/main" ,"/hero"})
    public String sayHello() {

        // Returns a simple greeting
        return "Hello From BridgeLabz!!";
    }

    // Handles GET requests to /hello/query with a query parameter "name"
    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name) {
        // Extracts the "name" query parameter
        return "Hello " + name + "!";
    }

    // Handles GET requests to /hello/param/{name} with a path variable "name"
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        // Returns a greeting with the name
        return "Hello " + name + "!";
    }

    // Handles POST requests to /hello/post with a User object in the request body (JSON)
    @PostMapping("/post") // Maps POST requests to /post
    public String sayHello(@RequestBody User user) {
        // Returns a greeting with the user's name
        return "Hello " + user.getFirstName() + " " + user.getLastName() + "!";
    }

    // Handles PUT requests to /hello/put/{firstName} with a path variable "firstName" and a query parameter "lastName"
    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) { // Extracts the "firstName" path variable and "lastName" query parameter
        // Returns a greeting with both names
        return "Hello " + firstName + " " + lastName + "!";
    }
}