package com.jaybhensdadia.hrms.repository;

import com.jaybhensdadia.hrms.entity.PreviousEmployeement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PreviousEmployeementRepository extends JpaRepository<PreviousEmployeement,Long> {

    @Query(
            nativeQuery = true,
            value = "SELECT * FROM PreviousEmployeement WHERE employeeId = :employeeId"
    )
    PreviousEmployeement findPreviousEmployeementByEmployeeId(@Param("employeeId") Long empId);
}
