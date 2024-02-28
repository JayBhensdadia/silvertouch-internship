package com.jaybhensdadia.hrms.service;


import com.jaybhensdadia.hrms.entity.Designation;

import java.util.List;

public interface DesignationService {

    Designation getDesignationById(Long id);

    public void saveDesignation(Designation designation);

    public Designation fetchDesignationByEmpId(Long empId);

    public void deleteDesignationByEmpId(Long empId);

    Designation fetchById(Long designationId);

    List<Designation> fetchAll();
}
