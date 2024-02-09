package com.jaybhensdadia.security4.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long empId;
    private String empName;
    private String empRole;
    private String empEmail;
    private String empPassword;
    private String empPhoneNumber;
    private String empAddress;
    private String empEducation;

    private String empCompany;
    private String empPhotoUrl;
    private String empBio;
}
