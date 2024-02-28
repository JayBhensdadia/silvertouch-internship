package com.jaybhensdadia.foodorder.config;

import org.apache.tomcat.util.net.DispatchType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import jakarta.servlet.DispatcherType;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    
    @Autowired
    AuthenticationProvider authenticationProvider;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception{

        httpSecurity
        .csrf(cust -> cust.disable())
        .cors(cust -> cust.disable())
        .authorizeHttpRequests(cust -> cust
            .requestMatchers("/signup").permitAll()
            .requestMatchers("/restaurant/add-restaurant-to-db").permitAll()
            .dispatcherTypeMatchers(DispatcherType.FORWARD).permitAll()
            .anyRequest().authenticated()
        )
        .formLogin(cust -> {
            cust
            .loginPage("/signin").permitAll()
            .usernameParameter("email")
            .passwordParameter("password")
            .successHandler((req, res,auth)->{
                res.sendRedirect("/");
            });  
        })
        .authenticationProvider(authenticationProvider);


        return httpSecurity.build();
    }
}
