package com.jaybhensdadia.hrms.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class ReportingOfficer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    private Employee employeeId;

    private Date startDate;

    private Date endDate;

    private String ddo;

    @NotBlank
    private String dh;

    @NotBlank
    private String ho;

    @NotBlank
    private String hod;

    @NotBlank
    private Date authorizationDate;

    private String textArea;

}
