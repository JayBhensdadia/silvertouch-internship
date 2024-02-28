package com.jaybhensdadia.foodorder.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.jaybhensdadia.foodorder.entities.Offer;

public interface OfferService {
    

    List<Offer> getAllOffers();
    void addOffer(Offer offer);
    Offer getOfferById(Long id) throws Exception;
    void saveToDb(Offer offer);
    void deleteOfferById(Long id);
    Page<Offer> getPaginatedOffers(Pageable pageable);
}
