package com.jaybhensdadia.hrms.service;


import com.jaybhensdadia.hrms.repository.FamilyRepository;
import com.jaybhensdadia.hrms.entity.Family;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FamilyServiceImplementation implements FamilyService{

    @Autowired
    private FamilyRepository familyRepository;

    @Override
    public Family getFamilyById(Long id) {
        return familyRepository.findById(id).orElseThrow();
    }

    @Override
    public void saveFamily(Family family) {
        familyRepository.save(family);
    }

    @Override
    public Family fetchFamilyByEmpId(Long empId) {
        return familyRepository.findFamilyByEmployeeId(empId);
    }

    @Override
    public void deleteFamilyByEmpId(Long empId) {
        familyRepository.deleteByEmpId(empId);
    }
}
