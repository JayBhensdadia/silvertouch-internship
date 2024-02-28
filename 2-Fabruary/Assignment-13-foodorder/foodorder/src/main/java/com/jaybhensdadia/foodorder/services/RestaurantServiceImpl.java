package com.jaybhensdadia.foodorder.services;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.jaybhensdadia.foodorder.entities.Restaurant;
import com.jaybhensdadia.foodorder.repositories.RestaurantRepo;

@Service
public class RestaurantServiceImpl  implements RestaurantService{

    @Autowired
    RestaurantRepo restaurantRepo;

    @Override
    public void addRestaurant(Restaurant restaurant) {
       restaurantRepo.save(restaurant);
    }

    @Override
    public void deleteRestaurantById(Long id) {
        restaurantRepo.deleteById(id);
    }

    @Override
    public List<Restaurant> getAllRestaurants() {
        return restaurantRepo.findAll();
    }

    @Override
    public Restaurant getRestaurantById(Long id) throws Exception {
        Optional<Restaurant> restaurant = restaurantRepo.findById(id);
        if(!restaurant.isPresent()){throw new Exception("restaurant does not exits");}
        return restaurant.get();
    }

    @Override
    public void saveToDb(Restaurant restaurant) {
        restaurantRepo.save(restaurant);
    }
    

    @Override
    public Page<Restaurant> getPaginatedRestaurants(Pageable pageable) {
        int pageSize = pageable.getPageSize();
        int currentPage = pageable.getPageNumber();
        int startItem = currentPage * pageSize;
        List<Restaurant> restaurants = restaurantRepo.findAll();
        List<Restaurant> list;
        if(restaurants.size() < startItem)
            list = Collections.emptyList();
        else{
            int toIndex = Math.min(startItem + pageSize, restaurants.size());
            list = restaurants.subList(startItem, toIndex);
        }
        Page<Restaurant> restaurantPage = new PageImpl<>(list, PageRequest.of(currentPage,pageSize), restaurants.size());
        return restaurantPage;
    }
}
