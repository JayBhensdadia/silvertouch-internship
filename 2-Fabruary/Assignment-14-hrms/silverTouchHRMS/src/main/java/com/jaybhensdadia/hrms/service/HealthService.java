package com.jaybhensdadia.hrms.service;

import com.jaybhensdadia.hrms.entity.Health;

public interface HealthService {
    public void saveService(Health health);

    public Health fetchHealthById(Long id);
    public void deleteHealthByEmpId(Long empId);
}
