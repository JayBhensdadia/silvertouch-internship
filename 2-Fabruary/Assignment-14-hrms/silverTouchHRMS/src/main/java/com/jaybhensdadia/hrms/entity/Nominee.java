package com.jaybhensdadia.hrms.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "tbl_nominee")
@NoArgsConstructor
public class Nominee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nomineeId;

    @Enumerated(EnumType.ORDINAL)
    private Priority priority;

    @NotBlank
    private String firstName;

    @NotBlank
    private String middleName;

    @NotBlank
    private String lastName;

    @NotBlank
    private String relation;

    private String gender;

    @NotNull
    private String dateOfBirth;

//    @NotBlank
    private String UIDNumber;

    @NotBlank
    @Pattern(regexp = "^([0][1-9]|[1-2][0-9]|[3][0-5])([a-zA-Z]{5}[0-9]{4}[a-zA-Z]{1})([1-9a-zA-Z]{1}[zZ]{1}[0-9a-zA-Z]{1})+$", message = "Invalid PAN number")
    private String panNumber;


    private Long contactNumber;

    private String nomineeInvalidCondition;


    @OneToOne(mappedBy = "employeeNominee")
    private Employee employee;
}
