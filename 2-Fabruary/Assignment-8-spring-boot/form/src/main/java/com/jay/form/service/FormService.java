package com.jay.form.service;

import com.jay.form.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface FormService {
    public User saveUser(User user);
    public List<User> getUsers();
}
