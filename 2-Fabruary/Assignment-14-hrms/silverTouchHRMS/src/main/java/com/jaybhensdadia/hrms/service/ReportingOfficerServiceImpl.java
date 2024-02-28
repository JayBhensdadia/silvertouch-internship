package com.jaybhensdadia.hrms.service;

import com.jaybhensdadia.hrms.entity.ReportingOfficer;
import com.jaybhensdadia.hrms.repository.ReportingOfficerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportingOfficerServiceImpl implements ReportingOfficerService {

    @Autowired
    private ReportingOfficerRepository reportingOfficerRepository;
    @Override
    public List<ReportingOfficer> fetchAllReportingOfficer() {
        return this.reportingOfficerRepository.findAll();
    }

    @Override
    public ReportingOfficer fetchById(Long id) {
        return this.reportingOfficerRepository.findById(id).get();
    }

    @Override
    public void saveReportingOfficer(ReportingOfficer reportingOfficer) {
        this.reportingOfficerRepository.save(reportingOfficer);

    }
    @Override
    public void deleteReportingOfficer(Long id) {
        this.reportingOfficerRepository.deleteById(id);
    }
}
