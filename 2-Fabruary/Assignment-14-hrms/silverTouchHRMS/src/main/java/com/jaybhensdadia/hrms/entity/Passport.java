package com.jaybhensdadia.hrms.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "tbl_passport")
@Data
public class Passport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long passportId;

    private Long passportNo;
    private String dateOfExpiry;

    private String visaDetail;

}
