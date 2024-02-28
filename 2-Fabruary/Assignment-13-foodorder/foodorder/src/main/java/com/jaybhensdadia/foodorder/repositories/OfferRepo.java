package com.jaybhensdadia.foodorder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaybhensdadia.foodorder.entities.Offer;



public interface OfferRepo extends JpaRepository<Offer, Long>{
    
}
