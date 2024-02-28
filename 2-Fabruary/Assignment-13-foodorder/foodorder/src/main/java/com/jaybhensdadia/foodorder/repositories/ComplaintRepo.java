package com.jaybhensdadia.foodorder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jaybhensdadia.foodorder.entities.Complaint;


public interface ComplaintRepo extends JpaRepository<Complaint,Long>{
    
}
