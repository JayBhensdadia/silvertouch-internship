package com.jaybhensdadia.securitydb.config;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Demo {
    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode("suresh"));
    }
}
