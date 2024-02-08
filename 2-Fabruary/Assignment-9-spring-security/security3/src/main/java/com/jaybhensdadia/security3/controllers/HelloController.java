package com.jaybhensdadia.security3.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/employee/work")
    public String empWork(){
        return "employee is working";
    }

    @GetMapping("/employee/eat")
    public String empEat(){
        return "employee is on lunch break";
    }

    @GetMapping("/manager/update")
    public String managerUpdate(){
        return "manager is forwarding update";
    }

    @GetMapping("/manager/hire")
    public String managerHire(){ return "manager is hiring new resource";}
}
