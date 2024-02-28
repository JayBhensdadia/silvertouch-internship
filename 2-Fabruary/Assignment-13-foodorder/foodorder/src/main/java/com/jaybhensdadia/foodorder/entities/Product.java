package com.jaybhensdadia.foodorder.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long restaurantId;
    private String categoryName;
    private String subCategoryName;
    private String productName;
    private String imageURL;
    private Integer price;
    private String description;
}
