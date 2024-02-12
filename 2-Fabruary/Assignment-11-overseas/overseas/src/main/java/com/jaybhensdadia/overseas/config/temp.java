package com.jaybhensdadia.overseas.config;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class temp {
    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode("ajay"));
    }
}
