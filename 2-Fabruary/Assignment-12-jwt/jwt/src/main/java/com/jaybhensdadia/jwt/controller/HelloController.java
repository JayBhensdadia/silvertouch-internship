package com.jaybhensdadia.jwt.controller;

import com.jaybhensdadia.jwt.config.JwtService;
import com.jaybhensdadia.jwt.entity.User;
import com.jaybhensdadia.jwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class HelloController {

    @Autowired
    private UserRepository userRepository;


    @Autowired
    private JwtService jwtService;

    @GetMapping("/")
    public String hello(){
        return "Hi there";
    }

    @PostMapping("/register")
    public String  register(@RequestBody User user){
        String token = jwtService.generateToken(user);
        userRepository.save(user);
        return token;
    }

    @PostMapping("/login")
    public String login(@RequestBody User user){
        Optional<User> dbUser =  userRepository.findByEmail(user.getEmail());
        if(!dbUser.isPresent()){return "user not exists";}
        else{
            return jwtService.generateToken(dbUser.get());
        }
    }

}
