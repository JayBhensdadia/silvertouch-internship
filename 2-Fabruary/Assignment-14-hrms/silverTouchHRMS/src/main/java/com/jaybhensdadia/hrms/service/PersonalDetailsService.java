package com.jaybhensdadia.hrms.service;

import com.jaybhensdadia.hrms.entity.PersonalDetails;

public interface PersonalDetailsService {

    PersonalDetails getPersonalDetailsById(Long id);
    public void savePersonalDetails(PersonalDetails personalDetails);

    public PersonalDetails fetchPersonalDetailsByEmployeeId(Long empId);


    public void deletePersonalDetailsByEmployeeId(Long empId);
}
