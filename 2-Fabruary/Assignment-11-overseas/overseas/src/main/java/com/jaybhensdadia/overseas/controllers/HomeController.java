package com.jaybhensdadia.overseas.controllers;

import com.jaybhensdadia.overseas.entities.Apointment;
import com.jaybhensdadia.overseas.entities.User;
import com.jaybhensdadia.overseas.repositories.ApointmentRepo;
import com.jaybhensdadia.overseas.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class HomeController {

    @Autowired
    UserRepo userRepo;

    @Autowired
    ApointmentRepo apointmentRepo;

    @GetMapping("/signin")
    public String login(){
        return "login";
    }

    @GetMapping("/about")
    public String about(Model model, Principal principal){

        String email = principal.getName();
        User current = userRepo.findByEmail(email);

        if(current==null){throw new UsernameNotFoundException("user not found");}
        else if (current.getRole().equals("ROLE_ADMIN")){

            List<User> allUsers = userRepo.findAll();
            model.addAttribute("allUsers",allUsers);


            return "admin-about";
        }else if (current.getRole().equals("ROLE_USER")){

            List<User> consultants = userRepo.findAll().stream().filter(user -> {
                return user.getRole().equals("ROLE_CONSULTANT");
            }).collect(Collectors.toList());


            model.addAttribute("consultants",consultants);


            return "user-about";
        }else{



            List<Apointment> apointments = apointmentRepo.findAll().stream().filter(apointment -> {
                return apointment.getConsultantId()==current.getId();
            }).collect(Collectors.toList());

            model.addAttribute("apointments",apointments);
            return "consultant-about";
        }





    }
}
