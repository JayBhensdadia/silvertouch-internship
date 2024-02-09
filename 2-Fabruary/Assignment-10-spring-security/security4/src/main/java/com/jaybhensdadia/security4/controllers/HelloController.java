package com.jaybhensdadia.security4.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

    @GetMapping("/")
    public String temp(){
        return "redirect:/login";
    }
    @GetMapping("/login")
    public String hello(){
        return "login";
    }

    @PostMapping("/authenticate")
    public String auth(HttpServletRequest req){
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String role = req.getParameter("role");

        role = role.toUpperCase();

        System.out.println("inside authenticate");
        System.out.println(role);

        if(role.equals("ADMIN")){

            //authenticate admin
            //if success
            return "admin-dashboard";

        }else{
            return "employee-dashboard";
        }
    }

}
