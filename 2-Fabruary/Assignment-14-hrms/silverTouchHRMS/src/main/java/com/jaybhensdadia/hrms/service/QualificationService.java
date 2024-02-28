package com.jaybhensdadia.hrms.service;


import com.jaybhensdadia.hrms.entity.Qualification;

import java.util.List;

public interface QualificationService {

    public List<Qualification> fetchAllQualification();

    public Qualification fetchById(Long id);

    public void saveJob(Qualification qualification);

    public void deleteQualification(Long id);
}
