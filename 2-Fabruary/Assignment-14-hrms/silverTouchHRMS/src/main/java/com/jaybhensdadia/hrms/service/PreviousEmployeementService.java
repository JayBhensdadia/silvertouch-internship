package com.jaybhensdadia.hrms.service;


import com.jaybhensdadia.hrms.entity.PreviousEmployeement;

import java.util.List;

public interface PreviousEmployeementService {

    public List<PreviousEmployeement> fetchAllPreviousEmployeement();

    public PreviousEmployeement fetchById(Long id);

    public void saveJob(PreviousEmployeement previousEmployeement);

    public void deletePreviousEmployeement(Long id);
}
