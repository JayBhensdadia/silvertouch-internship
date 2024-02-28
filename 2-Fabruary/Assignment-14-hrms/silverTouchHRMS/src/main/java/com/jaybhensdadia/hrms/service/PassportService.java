package com.jaybhensdadia.hrms.service;

import com.jaybhensdadia.hrms.entity.Passport;

public interface PassportService {
    Passport getPassportById(Long id);
    public void savePassport(Passport passport);
    public Passport fetchPassportByEmployeeId(Long empId);
    public void deletePassportByEmployeeId(Long empId);
}
