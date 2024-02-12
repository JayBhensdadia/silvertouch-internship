package com.jaybhensdadia.securitydb.controllers;

import com.jaybhensdadia.securitydb.entities.Employee;
import com.jaybhensdadia.securitydb.repositories.EmployeeRepo;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class HomeController {

    @Autowired
    EmployeeRepo employeeRepo;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/about")
    public String about(Model model,Principal principal){
        List<Employee> list = employeeRepo.findAll();
        model.addAttribute("employees",list);
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String email = principal.getName();


        System.out.println(email);

        Employee current = employeeRepo.findByEmail(email);

        if(current==null){throw new UsernameNotFoundException("user not found");}
        else if (current.getRole().equals("ROLE_ADMIN")){
            return "about";
        }else{

            model.addAttribute("emp",current);

            return "employee-about";
        }
        //now check the role if admin then /admin-about
        //else /employee-about
        //if does not exists /error
//        return "about";
    }


    @GetMapping("/edit-user/{id}")
    public String editUser(@PathVariable("id") String id, Model model, Principal principal){

//        String email = principal.getName();
        Optional<Employee> emp = employeeRepo.findById(Integer.parseInt(id));




        if(!emp.isPresent()){
            throw new UsernameNotFoundException("user not found");
        }else{
            model.addAttribute("employee", emp.get());

        }


        return "edit-user";

    }


    @PostMapping("/update-user/{id}")
    public String updateUser(@PathVariable("id") String id, HttpServletRequest req){

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String role = req.getParameter("role");


        Optional<Employee> emp = employeeRepo.findById(Integer.parseInt(id));
        if(!emp.isPresent()){
            throw  new UsernameNotFoundException("user not found");
        }else{

            Employee old = emp.get();
            old.setName(name);
            old.setEmail(email);
            old.setPassword(password);
            old.setRole(role);

            employeeRepo.save(old);
            return "update-success";
        }
    }

    @GetMapping("/profile")
    public String profile(){
        return "profile";
    }

    @GetMapping("/signin")
    public String login(){
        return "login";
    }



    @GetMapping("/delete-user/{id}")
    public String deleteUser(@PathVariable String id){
        employeeRepo.deleteById(Integer.parseInt(id));
        return "delete-success";
    }


    @GetMapping("/add-user")
    public String addUser(HttpServletRequest req){
        return "add-user";
    }

    @PostMapping("/db-user-add")
    public String addUserToDb(HttpServletRequest req){
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String role = req.getParameter("role");
        String department = req.getParameter("department");

        Employee emp = new Employee(Integer.parseInt(id), name,  department,  role,  email,  new BCryptPasswordEncoder().encode(password));
        employeeRepo.save(emp);
        return "add-success";
    }

}
