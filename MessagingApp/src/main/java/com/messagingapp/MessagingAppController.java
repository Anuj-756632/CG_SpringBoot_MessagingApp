package com.messagingapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}
