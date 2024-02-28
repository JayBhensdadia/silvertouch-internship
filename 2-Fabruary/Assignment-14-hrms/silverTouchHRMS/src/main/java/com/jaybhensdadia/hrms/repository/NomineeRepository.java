package com.jaybhensdadia.hrms.repository;

import com.jaybhensdadia.hrms.entity.Nominee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface NomineeRepository extends JpaRepository<Nominee, Long> {
    @Query(
            nativeQuery = true,
            value = "SELECT * FROM tbl_nominee WHERE fk_employee_id = :employeeId"
    )
    Nominee findNomineeByEmployee(@Param("employeeId") Long empId);

    @Query(
            nativeQuery = true,
            value = "DELETE FROM tbl_nominee WHERE fk_employee_id = :employeeId"
    )
    void deleteByEmpId(@Param("employeeId") Long employeeId);
}
