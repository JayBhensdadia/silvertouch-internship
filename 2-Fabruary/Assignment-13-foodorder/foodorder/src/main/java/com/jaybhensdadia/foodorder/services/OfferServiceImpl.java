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

import com.jaybhensdadia.foodorder.entities.Offer;
import com.jaybhensdadia.foodorder.repositories.OfferRepo;

@Service
public class OfferServiceImpl implements OfferService{

    @Autowired
    OfferRepo offerRepo;

    @Override
    public void addOffer(Offer offer) {
        offerRepo.save(offer);
    }

    @Override
    public void deleteOfferById(Long id) {
        offerRepo.deleteById(id);
    }

    @Override
    public List<Offer> getAllOffers() {
        return offerRepo.findAll();
    }

    @Override
    public Offer getOfferById(Long id) throws Exception {
        Optional<Offer> offer = offerRepo.findById(id);
        if(!offer.isPresent()){throw new Exception("offer does not found");}
        return offer.get();
    }

    @Override
    public void saveToDb(Offer offer) {
        offerRepo.save(offer);
    }
    
    @Override
    public Page<Offer> getPaginatedOffers(Pageable pageable) {
        int pageSize = pageable.getPageSize();
        int currentPage = pageable.getPageNumber();
        int startItem = currentPage * pageSize;
        List<Offer> offers = offerRepo.findAll();
        List<Offer> list;

        if(offers.size() < startItem)
            list = Collections.emptyList();
        else{
            int toIndex = Math.min(startItem + pageSize, offers.size());
            list = offers.subList(startItem, toIndex);
        }

        return new PageImpl<>(list, PageRequest.of(currentPage,pageSize),offers.size());
    }
    
}
