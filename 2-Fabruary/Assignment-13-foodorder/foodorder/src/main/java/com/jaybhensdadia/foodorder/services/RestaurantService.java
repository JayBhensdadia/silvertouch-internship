package com.jaybhensdadia.foodorder.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.jaybhensdadia.foodorder.entities.Restaurant;

public interface RestaurantService {
    
    

     List<Restaurant> getAllRestaurants();
     void addRestaurant(Restaurant restaurant);
     Restaurant getRestaurantById(Long id) throws Exception;
     void saveToDb(Restaurant restaurant);
     void deleteRestaurantById(Long id);
     Page<Restaurant> getPaginatedRestaurants(Pageable pageable);
}
