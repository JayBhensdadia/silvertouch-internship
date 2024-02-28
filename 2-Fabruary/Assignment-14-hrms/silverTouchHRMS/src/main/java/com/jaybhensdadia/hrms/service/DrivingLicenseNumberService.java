package com.jaybhensdadia.hrms.service;

import com.jaybhensdadia.hrms.entity.DrivingLicenseNumber;

public interface DrivingLicenseNumberService {

    DrivingLicenseNumber getById(Long id);

    public void saveDrivingLicenseNumber(DrivingLicenseNumber drivingLicenseNumber);

    public DrivingLicenseNumber fetchDLByEmpId(Long empId);
    public void deleteDLByEmpId(Long empId);
}
