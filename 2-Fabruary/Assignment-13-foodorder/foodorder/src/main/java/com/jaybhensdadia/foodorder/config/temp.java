package com.jaybhensdadia.foodorder.config;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class temp {
    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode("jay"));
    }
}
