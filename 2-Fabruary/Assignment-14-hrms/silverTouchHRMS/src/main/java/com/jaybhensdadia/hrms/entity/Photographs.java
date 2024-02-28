package com.jaybhensdadia.hrms.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "tbl_photograph")
public class Photographs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long photographId;


    @NotBlank
    private String employeePhotoImageUrl;

    @NotBlank
    private String employeeSignImageUrl;


//    @OneToOne(mappedBy = "employeePhotograph")
//    private Employee employee;

}
