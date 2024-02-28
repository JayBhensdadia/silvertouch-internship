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
@Table(name = "tbl_contact")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "column_id")
    private Long contactId;
    // For a phone number (e.g., (123) 456-7890)
    @Pattern(regexp = "(\\+?( |-|\\.)?\\d{1,2}( |-|\\.)?)?(\\(?\\d{3}\\)?|\\d{3})( |-|\\.)?(\\d{3}( |-|\\.)?\\d{4})", message = "Invalid phone number format")
    private Long workPhone;

    private String extension;

    @Pattern(regexp = "(\\+)?(91)?( )?[789]\\d{9}", message = "Invalid mobile number format")
    private Long workMobile;

    // For a phone number (e.g., (123) 456-7890)
    @Pattern(regexp = "(\\+?( |-|\\.)?\\d{1,2}( |-|\\.)?)?(\\(?\\d{3}\\)?|\\d{3})( |-|\\.)?(\\d{3}( |-|\\.)?\\d{4})", message = "Invalid phone number format")
    private Long homePhone;

    @Pattern(regexp = "(\\+)?(91)?( )?[789]\\d{9}", message = "Invalid mobile number format")
    private Long homeMobile;


    @NotBlank
    @Email(message = "Invalid email address")
    private String corporateEmail;

    @NotBlank
    @Email(message = "Invalid email address")
    private String personalEmail;


    @NotBlank
    @Email(message = "Invalid email address")
    private String secondaryEmail;


    // @OneToMany(cascade = CascadeType.ALL)
    // @JoinColumn(referencedColumnName = "contact_id" , name = "fk_contact_id")
    // private List<Address> addresses;

    @OneToOne(mappedBy = "employeeContact")
    private Employee employee;

}
