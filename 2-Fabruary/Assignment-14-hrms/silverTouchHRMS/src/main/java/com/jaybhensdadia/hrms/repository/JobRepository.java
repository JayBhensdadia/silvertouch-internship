package com.jaybhensdadia.hrms.repository;

import com.jaybhensdadia.hrms.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job,Long> {

    @Query(
            nativeQuery = true,
            value = "SELECT * FROM Job WHERE employeeId = :employeeId"
    )
    Job findJobByEmployeeId(@Param("employeeId") Long empId);
}
