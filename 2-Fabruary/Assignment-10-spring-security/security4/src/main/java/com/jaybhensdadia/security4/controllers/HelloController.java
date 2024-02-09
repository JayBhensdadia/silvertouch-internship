package com.jaybhensdadia.security4.controllers;

import com.jaybhensdadia.security4.entities.Admin;
import com.jaybhensdadia.security4.entities.Employee;
import com.jaybhensdadia.security4.services.AdminService;
import com.jaybhensdadia.security4.services.EmployeeService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    AdminService adminService;

    @GetMapping("/")
    public String temp(){
        return "redirect:/login";
    }
    @GetMapping("/login")
    public String hello(){
        return "login";
    }

    @GetMapping("/add-employee")
    public String addEmployee(){
        return "redirect:/add-employee";
    }

    @GetMapping("/myadmin")
    public String admin(Model model){
        List<Employee> list = employeeService.getEmployees();
        List<Admin> admins = adminService.getAdmins();
        model.addAttribute("users",list);
        model.addAttribute("admins",admins);
        return "admin-dashboard";
    }

    @GetMapping("/myemployee")
    public String emp(){
        return "employee-dashboard";
    }

    @PostMapping("/authenticate")
    public String auth(HttpServletRequest req, HttpSession session){

        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String role = req.getParameter("role");

        role = role.toUpperCase();

        System.out.println("inside authenticate");
        System.out.println(role);

        if(role.equals("ADMIN")){

            //authenticate admin
            //if success

            session.setAttribute("name","vijay");
            session.setAttribute("password","vijay");

            return "redirect:/myadmin";

        }else{
            return "redirect:/myemployee";
        }
    }

}
