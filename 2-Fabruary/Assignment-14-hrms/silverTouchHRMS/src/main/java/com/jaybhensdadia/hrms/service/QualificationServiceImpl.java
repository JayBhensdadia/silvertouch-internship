package com.jaybhensdadia.hrms.service;

import com.jaybhensdadia.hrms.entity.Qualification;
import com.jaybhensdadia.hrms.repository.QualificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QualificationServiceImpl implements QualificationService {

    @Autowired
    private QualificationRepository qualificationRepository;
    @Override
    public List<Qualification> fetchAllQualification() {
        return this.qualificationRepository.findAll();
    }

    @Override
    public Qualification fetchById(Long id) {
        return this.qualificationRepository.findById(id).get();
    }

    @Override
    public void saveJob(Qualification qualification) {
        this.qualificationRepository.save(qualification);
    }

    @Override
    public void deleteQualification(Long id) {
        this.qualificationRepository.deleteById(id);
    }
}
