package com.jaybhensdadia.security3.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/jay")
    public String helloJay(){
        return "hello jay";
    }

    @GetMapping("/vijay")
    public String helloVijay(){
        return "hello vijay";
    }

    @GetMapping("/ajay")
    public String helloAjay(){
        return "hello ajay";
    }
}
