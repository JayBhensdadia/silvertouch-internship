package com.jaybhensdadia.foodorder.entities;

import org.springframework.stereotype.Controller;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Complaint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long restaurantId;
    private String userName;
    private String subject;
    private String description;
    private String complaintDate;
    private String replyDate;
    private String reply;
    private String status;
    private String attachment;
}
