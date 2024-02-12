package com.jaybhensdadia.overseas.config;


import com.jaybhensdadia.overseas.entities.User;
import com.jaybhensdadia.overseas.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepo.findByEmail(email);
        if(user==null){
            throw new UsernameNotFoundException("Username not found");
        }else{
            return  new CustomUser(user);
        }
    }
}