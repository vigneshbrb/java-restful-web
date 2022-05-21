package com.vb.javarestfulweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello-world")
    public String getHelloWorld() {
        return "Hello World!!";
    }

    @GetMapping("/hello-earth")
    public String getHelloEarth() {
        return "Hello Earth!!";
    }
}
