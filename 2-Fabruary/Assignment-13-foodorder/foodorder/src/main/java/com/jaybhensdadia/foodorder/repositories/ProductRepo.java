package com.jaybhensdadia.foodorder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaybhensdadia.foodorder.entities.Product;

public interface ProductRepo extends JpaRepository<Product,Long> {
    
}
