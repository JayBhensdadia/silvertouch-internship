package com.jaybhensdadia.hrms.repository;

import com.jaybhensdadia.hrms.entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface BankRepository extends JpaRepository<Bank, Long> {

    @Query(
            nativeQuery = true,
            value = "SELECT * FROM tbl_bank WHERE fk_employee_id = :employeeId"
    )
    Bank findBankByEmployeeId(@Param("employeeId") Long id);

    @Query(
            nativeQuery = true,
            value = "DELETE FROM tbl_bank WHERE fk_employee_id = :employeeId"
    )
    void deleteByEmpId(@Param("employeeId") Long employeeId);
}
