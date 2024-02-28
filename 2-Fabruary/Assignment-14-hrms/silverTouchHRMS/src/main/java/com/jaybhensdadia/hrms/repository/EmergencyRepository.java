package com.jaybhensdadia.hrms.repository;


import com.jaybhensdadia.hrms.entity.Emergency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmergencyRepository extends JpaRepository<Emergency, Long> {

    @Query(
            nativeQuery = true,
            value = "SELECT * FROM tbl_emergency WHERE fk_employee_id = :employeeId"
    )
    Emergency findEmergencyByEmployeeId(@Param("employeeId") Long empId);



    @Query(
            nativeQuery = true,
            value = "DELETE FROM tbl_emergency WHERE fk_employee_id = :employeeId"
    )
    void deleteByEmpId(@Param("employeeId") Long employeeId);
}
