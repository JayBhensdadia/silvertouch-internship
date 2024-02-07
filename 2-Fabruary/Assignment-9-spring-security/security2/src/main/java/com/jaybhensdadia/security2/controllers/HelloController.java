package com.jaybhensdadia.security2.controllers;

import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class HelloController {

    private final String HOME_VIEW_COUNT = "HOME_VIEW_COUNT";
    @GetMapping("/")
    public String hello(HttpSession session){
        incrementCount(session, HOME_VIEW_COUNT);
        return "Hello";
    }

    @GetMapping("/count")
    public String count(HttpSession session){
        return "HOME VIEW COUNT: " + session.getAttribute(HOME_VIEW_COUNT);
    }

    public void incrementCount(HttpSession session, String attr){
        var homeViewCount = session.getAttribute(attr)==null? 0 : (Integer) session.getAttribute(attr);
        session.setAttribute(attr, homeViewCount += 1);
    }
}
