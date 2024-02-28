package com.jaybhensdadia.foodorder.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Offer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String offerName;
    private String categoryName;
    private String subCategoryName;
    private String restaurantName;
    private Integer discount;
    private String description;


    // @Temporal(TemporalType.DATE)
    // private Date startDate;

    // @Temporal(TemporalType.DATE)
    // private Date endDate;


    private String startDate;
    private String endDate;
}
