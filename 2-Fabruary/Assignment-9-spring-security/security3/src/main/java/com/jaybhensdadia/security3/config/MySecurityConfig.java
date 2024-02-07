package com.jaybhensdadia.security3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class MySecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{

        http
                .authorizeHttpRequests(req -> req
                        .requestMatchers("/jay").hasRole("JAY")
                        .requestMatchers("/vijay").hasRole("VIJAY")
                        .requestMatchers("/ajay").hasRole("AJAY")
                        .anyRequest().authenticated()
                )
                .httpBasic(Customizer.withDefaults());

        return http.build();
    }


    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails jay =
                User.withDefaultPasswordEncoder()
                        .username("jay")
                        .password("jay")
                        .roles("JAY")
                        .build();

        UserDetails vijay =
                User.withDefaultPasswordEncoder()
                        .username("vijay")
                        .password("vijay")
                        .roles("VIJAY")
                        .build();

        UserDetails ajay =
                User.withDefaultPasswordEncoder()
                        .username("ajay")
                        .password("ajay")
                        .roles("AJAY")
                        .build();


        return new InMemoryUserDetailsManager(jay,vijay,ajay);


    }
}
