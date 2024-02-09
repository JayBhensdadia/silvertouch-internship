package com.jaybhensdadia.security4.security;

import jakarta.servlet.http.HttpSession;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.jaas.memory.InMemoryConfiguration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.ui.Model;

import java.util.Collection;
import java.util.Map;

@Configuration
@EnableWebSecurity
public class MySecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http, HttpSession session) throws Exception{


//        return http.formLogin(cust-> cust.loginPage("/login")).build();

        return http
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(req -> req
                        .requestMatchers("/*").hasRole("ADMIN")
                        .anyRequest().authenticated()
                )
                .httpBasic(Customizer.withDefaults())
                .build();





//
//
//                return http
//                        .csrf(csrf -> csrf.disable())
//                        .authorizeHttpRequests(req -> req
//                                .requestMatchers("/login").permitAll()
//                                .requestMatchers("/authenticate").permitAll()
//                                .requestMatchers("/myadmin").permitAll()
//                                .requestMatchers("/myemployee").permitAll()
//                                .requestMatchers("/add-employee").permitAll()
//                                .requestMatchers("/admin").hasRole("ADMIN")
//                                .anyRequest().authenticated()
//                        )
//                        .formLogin(cust -> cust.loginPage("/login"))
//                        .build();

    }

    @Bean
    public UserDetailsService userDetailsService(){


        UserDetails jay =
                User.withDefaultPasswordEncoder()
                        .username("jay")
                        .password("jay")
                        .roles("ADMIN")
                        .build();

        return new InMemoryUserDetailsManager(jay);
    }



}
