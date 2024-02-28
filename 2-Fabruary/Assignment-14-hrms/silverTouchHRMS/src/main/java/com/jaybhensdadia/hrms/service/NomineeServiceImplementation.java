package com.jaybhensdadia.hrms.service;

import com.jaybhensdadia.hrms.repository.NomineeRepository;
import com.jaybhensdadia.hrms.entity.Nominee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NomineeServiceImplementation implements NomineeService{

    @Autowired
    NomineeRepository nomineeRepository;

    @Override
    public Nominee getNomineeById(Long id) {
        return nomineeRepository.findById(id).orElseThrow();
    }

    @Override
    public void saveNominee(Nominee nominee) {
        nomineeRepository.save(nominee);
    }

    @Override
    public Nominee fetchNomineeByEmployeeId(Long empId) {
        return nomineeRepository.findNomineeByEmployee(empId);
    }

    @Override
    public void deleteNomineeByEmployeeId(Long empId) {
        nomineeRepository.deleteByEmpId(empId);
    }
}
