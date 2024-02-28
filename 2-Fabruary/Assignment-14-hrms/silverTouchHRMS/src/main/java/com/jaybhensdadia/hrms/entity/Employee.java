package com.jaybhensdadia.hrms.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tbl_employee")
@Data
@RequiredArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private Long employeeId;

    @NotNull
    private String employeeCodePrefix;

    @NotNull
    private Integer employeeCodeSufix;

    @NotBlank
    private String employeePanNumber;
    private String employeeOldEmployeeCode;

    @NotNull
    private String employeeDateOfAppointment;



    private Long employeeBioMetricId;

    @NotBlank
    private String employeeSalution;

    @NotBlank
    private String employeeDepartment;

    @NotBlank
    private String employeeFirstName;

    @NotBlank
    private String employeeMiddleName;

    @NotBlank
    private String employeeLastName;


    private String employeeUnit;

    private Boolean employeeIsGazetted;



    @NotBlank
    private String employeeGroup;

    @NotBlank
    private String employeeEligibleFor;
    private Boolean employeeIsCoveredUnderGratuityAct;



    //Mappings
    @NotNull
//    @OneToOne(cascade = CascadeType.ALL)
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_designation_id")
    private Designation employeeDesignation;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_bank_id")
    private Bank employeeBank;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_personal_id")
    private PersonalDetails employeePersonalDetails;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_contact_id")
    private Contact employeeContact;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_family_id")
    private Family employeeFamily;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_emergency_id")
    private Emergency employeeEmergency;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_nominee_id")
    private Nominee employeeNominee;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_health_id")
    private Health employeeHealth;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_photograph_id")
    private List<Photographs> employeePhotograph;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_employee_id",referencedColumnName = "emp_id")
    private List<Attachment> employeeAttachments;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_driving_license_id")
    private DrivingLicenseNumber employeeDrivingLicense;

}
