package com.jaybhensdadia.hrms.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Qualification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Basic employeeId;

    @NotBlank
    private String qualification;

    private String modeOfStudy;

    private String university;

    @NotBlank
    private long passingMonth;

    private String institute;

    @NotBlank
    private long passingYear;

    private long duration;

    private String major;

    private float percentage;

    private String grade;

    private float percentile;

    private float gpaScore;

    private String remark;

    @ManyToOne
    private Address instituteAddress;

}
