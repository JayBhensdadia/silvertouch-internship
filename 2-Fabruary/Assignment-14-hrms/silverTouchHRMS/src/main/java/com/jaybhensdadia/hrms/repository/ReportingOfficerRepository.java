package com.jaybhensdadia.hrms.repository;

import com.jaybhensdadia.hrms.entity.ReportingOfficer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportingOfficerRepository extends JpaRepository<ReportingOfficer,Long> {
    @Query(
            nativeQuery = true,
            value = "SELECT * FROM ReportingOfficer WHERE employeeId = :employeeId"
    )
    ReportingOfficer findReportingOfficerByEmployeeId(@Param("employeeId") Long empId);
}
