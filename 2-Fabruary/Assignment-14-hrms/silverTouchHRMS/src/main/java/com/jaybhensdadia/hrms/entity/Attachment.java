package com.jaybhensdadia.hrms.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "tbl_attachment")
public class Attachment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long attachmentId;

    @NotNull
    @OneToOne(cascade = CascadeType.ALL)
    private DocumentCategory documentCategory;

    @NotBlank
    private String documentTitle;

    private String documentDescription;

    @NotBlank
    private String documentUrl;

//
//    @OneToOne(mappedBy = "employeeAttachments")
//    private Employee employee;
}
