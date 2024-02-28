package com.jaybhensdadia.foodorder.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.jaybhensdadia.foodorder.entities.City;

public interface CityService {
    
    List<City> getAllCities();
    void addCity(City city);

    City getCityById(Long id) throws Exception;
    void saveToDb(City city);
    
    void deleteCityById(Long id);

    Page<City> getPaginatedCities(Pageable pageable);
}
