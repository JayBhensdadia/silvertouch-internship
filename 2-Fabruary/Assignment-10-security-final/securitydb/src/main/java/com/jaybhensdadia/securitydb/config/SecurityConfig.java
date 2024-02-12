package com.jaybhensdadia.securitydb.config;

import jakarta.servlet.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {



    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public UserDetailsService getUserDetailsService(){
        return new CustomUserDetailsService();
    }

    @Bean
    public DaoAuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
        daoAuthenticationProvider.setUserDetailsService(getUserDetailsService());
        daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
        return daoAuthenticationProvider;
    }



    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

//        AuthenticationManager authenticationManager = http.getSharedObject(AuthenticationManager.class);
//.addFilterAt(new CustomBasicAuthFilter(authenticationManager), BasicAuthenticationFilter.class)
        http
                .csrf(csrf->csrf.disable())
                .authorizeHttpRequests(req -> req
                        .requestMatchers("/").permitAll()
                        .requestMatchers("/edit-user/**").hasAuthority("ROLE_ADMIN")
                        .requestMatchers("/update-user/**").hasAuthority("ROLE_ADMIN")
                        .requestMatchers("/delete-user/**").hasAuthority("ROLE_ADMIN")
                        .requestMatchers("/add-user/**").hasAuthority("ROLE_ADMIN")
                        .requestMatchers("/db-user-add/**").hasAuthority("ROLE_ADMIN")
                        .anyRequest().authenticated()
                )
//                .httpBasic(Customizer.withDefaults());
                .formLogin(cust -> cust
                        .loginPage("/signin").permitAll()
                        .usernameParameter("username")
                        .passwordParameter("password")
                        .successHandler((request, response, authentication) -> {
                            response.sendRedirect("/about");
                        })
                );



        return http.build();
    }

}
