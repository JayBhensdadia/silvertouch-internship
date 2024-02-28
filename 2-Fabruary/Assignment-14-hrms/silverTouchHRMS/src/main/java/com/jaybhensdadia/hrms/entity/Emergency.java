package com.jaybhensdadia.hrms.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="tbl_emergency")
public class Emergency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long emergencyId;


    @Enumerated(EnumType.ORDINAL)
    private Priority priority;

    private String firstName;

    private String middleName;

    private String lastName;

    private String relation;

    @Pattern(regexp = "(\\+?( |-|\\.)?\\d{1,2}( |-|\\.)?)?(\\(?\\d{3}\\)?|\\d{3})( |-|\\.)?(\\d{3}( |-|\\.)?\\d{4})" , message = "Invalid Phone number")
    private Long phoneNumber;


    @Pattern(regexp = "(\\+)?(91)?( )?[789]\\d{9}", message = "Invalid mobile number format")
    private Long mobileNumber;

    @NotBlank
    @Email
    private String email;


    private String address;


    @OneToOne(mappedBy = "employeeEmergency")
    private Employee employee;
}
