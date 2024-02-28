package com.jaybhensdadia.hrms.service;

import com.jaybhensdadia.hrms.repository.DrivingLicenseNumberRepository;
import com.jaybhensdadia.hrms.entity.DrivingLicenseNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DrivingLicenseNumberServiceImplementation implements DrivingLicenseNumberService{

    @Autowired
    private DrivingLicenseNumberRepository drivingLicenseNumberRepository;

    @Override
    public DrivingLicenseNumber getById(Long id) {
        return drivingLicenseNumberRepository.findById(id).orElseThrow();
    }

    @Override
    public void saveDrivingLicenseNumber(DrivingLicenseNumber drivingLicenseNumber) {
        drivingLicenseNumberRepository.save(drivingLicenseNumber);
    }

    @Override
    public DrivingLicenseNumber fetchDLByEmpId(Long empId) {
        return drivingLicenseNumberRepository.findDlByEmployeeId(empId);
    }

    @Override
    public void deleteDLByEmpId(Long empId) {
        drivingLicenseNumberRepository.deleteByEmpId(empId);
    }
}
