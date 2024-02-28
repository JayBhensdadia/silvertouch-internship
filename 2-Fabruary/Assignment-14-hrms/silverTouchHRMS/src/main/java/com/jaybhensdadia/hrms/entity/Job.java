package com.jaybhensdadia.hrms.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long jobId;

    @OneToOne
    private Basic employeeId;

    @NotBlank
    private String employmentType;

    @NotBlank
    private String employmentCategory;

    @NotBlank
    private String employmentSubType;

    private boolean employmentStatus;

    private long noticePeriod;

    private String employeeGrade;

    private long probationDuration;

    private Date probationStartDate;

    private String dutiesAndResponsibilities;

    private String insuranceStartGroup;

    private Date insuranceEffectiveFrom;



    private String placeOfPosting;

    private String branchName;

    private String workLocation;

    private String designation;

    private Date dateOfPosting;

    private String groupWhenPosting;

    private long postingOrderNumber;

    private Date dateOfPostingOrder;

    private String payConfiguration;

    private String scale;

    private long scaleValue;

    private String gradePay;

    private boolean recruitmentType;

    private String recruitmentTypeOther;

    private String recruitmentShiftOther;

    private String recruitmentShiftInternal;

    private Date weeklyOffEffectiveFrom;

    private String weeklyOff;



}
