package com.jay.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewController {

    @GetMapping("/temp")
    public String temp(){
        return "temp";
    }
}
