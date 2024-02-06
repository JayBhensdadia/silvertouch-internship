package com.jay.form.service;

import com.jay.form.entity.User;
import com.jay.form.repository.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormServiceImpl implements FormService{

    @Autowired
    private FormRepository formRepo;
    @Override
    public User saveUser(User user) {
        return this.formRepo.save(user);
    }

    @Override
    public List<User> getUsers() {
        return this.formRepo.findAll();
    }
}
