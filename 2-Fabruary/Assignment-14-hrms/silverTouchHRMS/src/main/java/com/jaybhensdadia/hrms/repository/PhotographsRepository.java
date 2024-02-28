package com.jaybhensdadia.hrms.repository;


import com.jaybhensdadia.hrms.entity.Photographs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhotographsRepository extends JpaRepository<Photographs, Long> {

    @Query(
            nativeQuery = true,
            value = "SELECT * FROM tbl_photograph WHERE fk_employee_id = :employeeId"
    )
    List<Photographs> findPhotographsByEmployeeId(@Param("employeeId") Long empId);


    @Query(
            nativeQuery = true,
            value = "DELETE FROM tbl_photograph WHERE fk_employee_id = :employeeId"
    )
    void deleteByEmpId(@Param("employeeId") Long employeeId);
}
