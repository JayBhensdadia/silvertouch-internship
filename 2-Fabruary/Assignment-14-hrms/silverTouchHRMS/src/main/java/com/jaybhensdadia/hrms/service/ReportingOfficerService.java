package com.jaybhensdadia.hrms.service;


import com.jaybhensdadia.hrms.entity.ReportingOfficer;

import java.util.List;

public interface ReportingOfficerService {
    public List<ReportingOfficer> fetchAllReportingOfficer();

    public ReportingOfficer fetchById(Long id);

    public void saveReportingOfficer(ReportingOfficer reportingOfficer);

    public void deleteReportingOfficer(Long id);
}
