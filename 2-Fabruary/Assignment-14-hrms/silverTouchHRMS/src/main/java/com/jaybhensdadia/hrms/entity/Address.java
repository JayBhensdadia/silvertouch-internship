package com.jaybhensdadia.hrms.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
@Table(name = "tbl_address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;

    @NotBlank
    private String addressType;

    @NotBlank
    private String address;

    @NotBlank
    private String country;

    @NotBlank
    private String state;

    @NotBlank
    private String district;

    @NotBlank
    private String city;

    @NotBlank
    @Digits(integer = 6,message = "6 Digits PINCODE is valid" ,fraction = 0)
    @Size(min = 6, max = 6, message = "Pincode must have exactly 6 digits")
    private Integer pincode;


    @NotBlank
    private String ownerShip;

    private Boolean allAddressAreSame;
}
