package com.jaybhensdadia.foodorder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jaybhensdadia.foodorder.entities.City;

public interface CityRepo extends JpaRepository<City,Long> {
    
}
