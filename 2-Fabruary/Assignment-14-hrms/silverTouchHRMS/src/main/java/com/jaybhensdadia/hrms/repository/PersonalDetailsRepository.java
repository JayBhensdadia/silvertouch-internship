package com.jaybhensdadia.hrms.repository;

import com.jaybhensdadia.hrms.entity.PersonalDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalDetailsRepository extends JpaRepository<PersonalDetails, Long> {

    @Query(
            nativeQuery = true,
            value = "SELECT * FROM tbl_personal_details WHERE fk_employee_id = :employeeId"
    )
    PersonalDetails findPersonalDetailsByEmployeeId(@Param("employeeId") Long empId);



    @Query(
            nativeQuery = true,
            value = "DELETE FROM tbl_personal_details WHERE fk_employee_id = :employeeId"
    )
    void deleteByEmpId(@Param("employeeId") Long employeeId);
}
