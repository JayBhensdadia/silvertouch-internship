package com.jaybhensdadia.hrms.service;

import com.jaybhensdadia.hrms.repository.PersonalDetailsRepository;
import com.jaybhensdadia.hrms.entity.PersonalDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalDetailsServiceImplementation implements PersonalDetailsService{

    @Autowired
    private PersonalDetailsRepository personalDetailsRepository;

    @Override
    public PersonalDetails getPersonalDetailsById(Long id) {
        return personalDetailsRepository.findById(id).orElseThrow();
    }

    @Override
    public void savePersonalDetails(PersonalDetails personalDetails) {
        personalDetailsRepository.save(personalDetails);
    }

    @Override
    public PersonalDetails fetchPersonalDetailsByEmployeeId(Long empId) {
        return personalDetailsRepository.findPersonalDetailsByEmployeeId(empId);
    }

    @Override
    public void deletePersonalDetailsByEmployeeId(Long empId) {
        personalDetailsRepository.deleteByEmpId(empId);
    }
}
