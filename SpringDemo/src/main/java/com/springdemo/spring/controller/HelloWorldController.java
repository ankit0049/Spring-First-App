package com.springdemo.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
// Marks this class as an MVC Controller
@Controller
public class HelloWorldController {
    // Maps requests to "/hello"
    @GetMapping("/hello")
    public String sayHello(Model model) {
        // Adding a message to the model
        model.addAttribute("message", "Hello from BridgeLabz  ankit rajput");

        // Returning the view name (hello.html)
        return "hello";
    }
}
