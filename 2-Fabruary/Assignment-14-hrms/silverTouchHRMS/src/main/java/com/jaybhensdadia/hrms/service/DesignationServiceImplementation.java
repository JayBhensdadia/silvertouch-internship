package com.jaybhensdadia.hrms.service;

import com.jaybhensdadia.hrms.repository.DesignationRepository;
import com.jaybhensdadia.hrms.entity.Designation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DesignationServiceImplementation implements DesignationService{

    @Autowired
    private DesignationRepository designationRepository;

    @Override
    public Designation getDesignationById(Long id) {
        return designationRepository.findById(id).orElseThrow();
    }

    @Override
    public void saveDesignation(Designation designation) {
        designationRepository.save(designation);
    }

    @Override
    public Designation fetchDesignationByEmpId(Long empId) {
        return designationRepository.findDesignationByEmployeeId(empId);
    }

    @Override
    public void deleteDesignationByEmpId(Long empId) {
        designationRepository.deleteByEmpId(empId);
    }

    @Override
    public Designation fetchById(Long designationId) {
        return designationRepository.findById(designationId).orElseThrow();
    }

    @Override
    public List<Designation> fetchAll() {
        return designationRepository.findAll();
    }


}
