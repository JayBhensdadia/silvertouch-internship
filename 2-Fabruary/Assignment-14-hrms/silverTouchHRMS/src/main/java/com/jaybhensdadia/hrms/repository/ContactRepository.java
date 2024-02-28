package com.jaybhensdadia.hrms.repository;

import com.jaybhensdadia.hrms.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

    @Query(
            nativeQuery = true,
            value = "SELECT * FROM tbl_contact WHERE fk_employee_id = :employeeId"
    )
    Contact findContactByEmployeeId(@Param("employeeId") Long empId);


    @Query(
            nativeQuery = true,
            value = "DELETE FROM tbl_contact WHERE fk_employee_id = :employeeId"
    )
    void deleteByEmpId(@Param("employeeId") Long employeeId);
}
