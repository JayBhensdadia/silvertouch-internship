package com.jaybhensdadia.hrms.service;


import com.jaybhensdadia.hrms.entity.Family;

public interface FamilyService {

    Family getFamilyById(Long id);

    public void saveFamily(Family family);

    public Family fetchFamilyByEmpId(Long empId);

    public void deleteFamilyByEmpId(Long empId);


}
