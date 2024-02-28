package com.jaybhensdadia.hrms.service;

import com.jaybhensdadia.hrms.entity.Nominee;

public interface NomineeService {

    Nominee getNomineeById(Long id);
    public void saveNominee(Nominee nominee);

    public Nominee fetchNomineeByEmployeeId(Long empId);
    public void deleteNomineeByEmployeeId(Long empId);
}
