package com.jaybhensdadia.hrms.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "tbl_bank")
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bankId;

    @NotBlank
    private String bankName;

    @NotBlank
    private String bankBranchName;

    @NotBlank
    private String bankAccountNumber;

    @NotBlank
    private String ifscCode;

    private String bsrCode;

    @OneToOne(mappedBy = "employeeBank")
    private Employee employee;
}
