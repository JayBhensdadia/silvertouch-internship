package com.jaybhensdadia.hrms.repository;


import com.jaybhensdadia.hrms.entity.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttachmentRepository extends JpaRepository<Attachment, Long> {

    @Query(
            nativeQuery = true,
            value = "SELECT * FROM tbl_attachment WHERE fk_employee_id = :employeeId"
    )
    List<Attachment> findByEmployeeId(@Param("employeeId") Long employeeId);


    @Query(
            nativeQuery = true,
            value = "DELETE FROM tbl_attachment WHERE fk_employee_id = :employeeId"
    )
    void deleteByEmpId(@Param("employeeId") Long employeeId);

}
