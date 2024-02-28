package com.jaybhensdadia.hrms.service;

import com.jaybhensdadia.hrms.repository.PassportRepository;
import com.jaybhensdadia.hrms.entity.Passport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassportServiceImplementation implements PassportService{

    @Autowired
    private PassportRepository passportRepository;

    @Override
    public Passport getPassportById(Long id) {
        return passportRepository.findById(id).orElseThrow();
    }

    @Override
    public void savePassport(Passport passport) {
        passportRepository.save(passport);
    }

    @Override
    public Passport fetchPassportByEmployeeId(Long empId) {
        return passportRepository.findPassportByEmployeeId(empId);
    }

    @Override
    public void deletePassportByEmployeeId(Long empId) {
        passportRepository.deleteByEmpId(empId);
    }
}
