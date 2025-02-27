package com.messagingapp;

import org.springframework.web.bind.annotation.*;

@RestController

public class MessagingAppController {
    //UseCase 1
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }


    //Use Case 2
    @GetMapping("/helloWorld")
    public String sayHello(@RequestParam(name = "name", defaultValue = "Mark") String name) {
        return "Hello, " + name + " from BridgeLabz!";
    }


    //Use Case 3
    @GetMapping("/hello/{name}")
    public String helloSay(@PathVariable(name = "name") String name) {
        // If name is not provided, default to "Mark"
        if (name == null || name.isEmpty()) {
            name = "Mark";
        }
        return "Hello " + name + " from BridgeLabz!";
    }


    // Use Case 4 - POST Request with JSON Body (UserDTO)
    @PostMapping("/hello World")
    public String sayHelloWithPost(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }

    // Use Case 5
    @PutMapping("/hello/{firstName}")
    public String sayHelloUsingPut(
            @PathVariable String firstName,
            @RequestParam(name = "lastName", defaultValue = "Taylor") String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}
