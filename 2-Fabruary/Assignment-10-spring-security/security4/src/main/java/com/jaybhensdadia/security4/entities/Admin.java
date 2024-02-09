package com.jaybhensdadia.security4.entities;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_admin")
public class Admin{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long adminId;

    private String adminName;
    private String adminRole;
    private String adminPassword;
    private String adminEmail;
    private String adminPhoneNumber;
    private String adminAddress;


}
