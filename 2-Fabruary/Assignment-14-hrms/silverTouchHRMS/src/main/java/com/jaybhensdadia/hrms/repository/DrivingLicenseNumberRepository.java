package com.jaybhensdadia.hrms.repository;


import com.jaybhensdadia.hrms.entity.DrivingLicenseNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DrivingLicenseNumberRepository extends JpaRepository<DrivingLicenseNumber, Long> {


    @Query(
            nativeQuery = true,
            value = "SELECT * FROM tbl_license WHERE fk_employee_id = :employeeId"
    )
    DrivingLicenseNumber findDlByEmployeeId(@Param("employeeId") Long empId);


    @Query(
            nativeQuery = true,
            value = "DELETE FROM tbl_license WHERE fk_employee_id = :employeeId"
    )
    void deleteByEmpId(@Param("employeeId") Long employeeId);
}
