package com.jaybhensdadia.hrms.service;


import com.jaybhensdadia.hrms.entity.PreviousEmployeement;
import com.jaybhensdadia.hrms.repository.PreviousEmployeementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PreviousEmployeementServiceImpl implements PreviousEmployeementService {

    @Autowired
    private PreviousEmployeementRepository previousEmployeementRepository;
    @Override
    public List<PreviousEmployeement> fetchAllPreviousEmployeement() {
        return this.previousEmployeementRepository.findAll();
    }

    @Override
    public PreviousEmployeement fetchById(Long id) {
        return this.previousEmployeementRepository.findById(id).get();
    }

    @Override
    public void saveJob(PreviousEmployeement previousEmployeement) {
        this.previousEmployeementRepository.save(previousEmployeement);

    }
    @Override
    public void deletePreviousEmployeement(Long id) {
        this.previousEmployeementRepository.deleteById(id);
    }
}
