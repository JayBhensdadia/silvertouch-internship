package com.jaybhensdadia.hrms.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.swing.text.Style;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class PreviousEmployeement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    private Employee employeeId;

    @NotBlank
    private Date fromDate;

    @NotBlank
    private Date toDate;

    @NotBlank
    private String companyName;

    @NotBlank
    private String serviceType;

    private String position;

    private long lastCtc;

    private String responsibilities;

    private String reasonForSepararion;

    private String hrContactPerson;

    private String PhoneNumber;

    private String MobileNumber;

    private String email;

    private String website;

    private String address;

    private String remark;

}
