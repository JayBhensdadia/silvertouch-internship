package com.jaybhensdadia.foodorder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaybhensdadia.foodorder.entities.SubCategory;

public interface SubCategoryRepo extends JpaRepository<SubCategory, Long>{
    
}
