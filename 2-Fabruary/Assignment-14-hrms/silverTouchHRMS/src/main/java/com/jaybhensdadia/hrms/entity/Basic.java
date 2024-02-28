package com.jaybhensdadia.hrms.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;

import java.sql.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Basic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn
    private long employeeId;

    @NotBlank
    private String employee_prefix;
    @NotBlank
    private String employee_suffix;

    @NotBlank(message = "Enter Pan")
    @Pattern(regexp = "^([0][1-9]|[1-2][0-9]|[3][0-5])([a-zA-Z]{5}[0-9]{4}[a-zA-Z]{1})([1-9a-zA-Z]{1}[zZ]{1}[0-9a-zA-Z]{1})+$",message = "Invalid Format")
    private String pan;

    private String old_employee_code;

    @NotBlank(message = "Enter Date")
    private Date appointment_date;
    private String biometric_id;

    @NotBlank(message = "Enter Salutation")
    private String salutation;

    @NotBlank(message = "Enter Department")
    private String department;

    @NotBlank(message = "Enter First Name")
    private String first_name;
    private String middle_name;
    private String last_name;
    private String unit;

    @NotBlank(message = "Select Designation")
    @OneToOne
    @JoinColumn
    private Designation designation;

    @NotBlank(message ="Select Group")
    @Column(name = "group_name")
    private String group;

    private boolean is_gazetted;

    @NotBlank(message ="Select Employee Eligibility")
    private String employee_eligible;
    private boolean gratuity_act;

    @NotBlank(message = "Upload Photo")
    private Byte photo;
}
