package com.jaybhensdadia.securitydb.config;

import com.jaybhensdadia.securitydb.entities.Employee;
import com.jaybhensdadia.securitydb.repositories.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private EmployeeRepo empRepo;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Employee emp = empRepo.findByEmail(email);
        if(emp==null){
            throw new UsernameNotFoundException("Username not found");
        }else{
            return  new CustomUser(emp);
        }
    }
}
