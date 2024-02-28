package com.jaybhensdadia.hrms.repository;

import com.jaybhensdadia.hrms.entity.Qualification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface QualificationRepository extends JpaRepository<Qualification,Long> {
    @Query(
            nativeQuery = true,
            value = "SELECT * FROM Qualification WHERE employeeId = :employeeId"
    )
    Qualification findQualificationByEmployeeId(@Param("employeeId") Long empId);
}
