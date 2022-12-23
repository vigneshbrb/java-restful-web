package com.vb.javarestfulweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class HelloWorldController {

    @GetMapping("/hello-world")
    public String getHelloWorld() {
        return "Hello World!!";
    }

    @GetMapping("/hello-earth")
    public String getHelloEarth() {
        List<String> nameList= Arrays.asList("Vignesh", "Babu");
        nameList.forEach(System.out::print);
        return "Hello Earth!!";
    }
}
