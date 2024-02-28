package com.jaybhensdadia.hrms.repository;

import com.jaybhensdadia.hrms.entity.Designation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DesignationRepository extends JpaRepository<Designation, Long> {


    @Query(
            nativeQuery = true,
            value = "SELECT * FROM tbl_document_category WHERE fk_employee_id = :employeeId"
    )
    Designation findDesignationByEmployeeId(@Param("employeeId") Long empId);


    @Query(
            nativeQuery = true,
            value = "DELETE FROM tbl_document_category WHERE fk_employee_id = :employeeId"
    )
    void deleteByEmpId(@Param("employeeId") Long employeeId);
}
