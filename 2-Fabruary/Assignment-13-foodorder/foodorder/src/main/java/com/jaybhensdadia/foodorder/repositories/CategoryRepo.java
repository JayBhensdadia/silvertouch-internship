package com.jaybhensdadia.foodorder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaybhensdadia.foodorder.entities.Category;

public interface CategoryRepo extends JpaRepository<Category,Long> {

}
