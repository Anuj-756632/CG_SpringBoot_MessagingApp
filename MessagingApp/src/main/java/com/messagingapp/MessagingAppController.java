package com.messagingapp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MessagingAppController {
    //UseCase 1
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }


    //Use Case 2
    @GetMapping("/hello")
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
}
