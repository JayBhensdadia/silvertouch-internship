package com.jaybhensdadia.hrms.service;

import com.jaybhensdadia.hrms.repository.HealthRepository;
import com.jaybhensdadia.hrms.entity.Health;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HealthServiceImplementation implements HealthService{

    @Autowired
    private HealthRepository healthRepository;

    @Override
    public void saveService(Health health) {
        healthRepository.save(health);
    }

    @Override
    public Health fetchHealthById(Long id) {
        return healthRepository.findById(id).orElseThrow();
    }

    @Override
    public void deleteHealthByEmpId(Long empId) {
        healthRepository.deleteByEmpId(empId);
    }
}
