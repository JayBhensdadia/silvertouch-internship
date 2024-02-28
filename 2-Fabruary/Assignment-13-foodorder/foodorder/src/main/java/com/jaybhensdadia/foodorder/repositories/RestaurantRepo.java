package com.jaybhensdadia.foodorder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaybhensdadia.foodorder.entities.Restaurant;

public interface RestaurantRepo extends JpaRepository<Restaurant, Long>{
    
}
