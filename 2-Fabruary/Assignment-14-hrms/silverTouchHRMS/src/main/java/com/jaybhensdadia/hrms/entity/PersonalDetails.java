package com.jaybhensdadia.hrms.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_personal_details")
@Data
@NoArgsConstructor
public class PersonalDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long personalDetailId;

    @NotBlank
    private String gender;


    private String marriageStatus;


    @NotNull
    @Temporal(TemporalType.DATE)
    private String DateOfBirth;


    @Temporal(TemporalType.DATE)
    private String DateOfMarriage;

    private String birthPlace;

    private String communityCategory;

    private String UIDNumber;

    private String GPFNumberAcNo;

    private String religion;

    private String caste;

    private String communityCategoryReference;

    private String nationality;

    private String postalLifeInsuarancePolicyNo;

    private String hobbies;


    @OneToOne(mappedBy = "employeePersonalDetails")
    private Employee employee;
}
