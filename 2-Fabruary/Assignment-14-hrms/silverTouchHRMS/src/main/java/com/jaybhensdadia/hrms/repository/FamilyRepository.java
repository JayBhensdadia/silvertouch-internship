package com.jaybhensdadia.hrms.repository;

import com.jaybhensdadia.hrms.entity.Family;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilyRepository extends JpaRepository<Family, Long> {

    @Query(
            nativeQuery = true,
            value = "SELECT * FROM tbl_family WHERE fk_employee_id = :employeeId"
    )
    Family findFamilyByEmployeeId(@Param("employeeId") Long empId);


    @Query(
            nativeQuery = true,
            value = "DELETE FROM tbl_family WHERE fk_employee_id = :employeeId"
    )
    void deleteByEmpId(@Param("employeeId") Long employeeId);
}
