package com.jay.form.controller;

import com.jay.form.entity.User;
import com.jay.form.repository.FormRepository;
import com.jay.form.service.FormService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.PrintWriter;
import java.util.List;

@Controller
public class FormController {

    @Autowired
    private FormService formService;


    @GetMapping("/")
    public String handleForm(){


        return "form";
    }

    @PostMapping("/save")
    public User saveToDb(HttpServletRequest req){
        User user = new User(req.getParameter("name"),req.getParameter("email"),req.getParameter("message"));
        return this.formService.saveUser(user);
    }


    @GetMapping("/users")
    public String getAllUserFromDb(){
//        List<User> list = this.formService.getUsers();
        return "temp";
    }

}
