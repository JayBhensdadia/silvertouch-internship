package com.jaybhensdadia.hrms.service;

import com.jaybhensdadia.hrms.repository.EmergencyRepository;
import com.jaybhensdadia.hrms.entity.Emergency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmergencyServiceImplementation implements EmergencyService{

    @Autowired
    private EmergencyRepository emergencyRepository;

    @Override
    public Emergency getEmergencyById(Long id) {
        return emergencyRepository.findById(id).orElseThrow();
    }

    @Override
    public void saveEmergency(Emergency emergency) {
        emergencyRepository.save(emergency);
    }

    @Override
    public Emergency fetchEmergencyByEmpId(Long empId) {
        return emergencyRepository.findEmergencyByEmployeeId(empId);
    }

    @Override
    public void deleteEmergencyByEmpId(Long empId) {
        emergencyRepository.deleteByEmpId(empId);
    }
}
