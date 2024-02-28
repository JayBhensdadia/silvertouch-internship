package com.jaybhensdadia.foodorder.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.jaybhensdadia.foodorder.entities.Complaint;

public interface ComplaintService {
    

    List<Complaint> getAllComplaints();

    void addComplaint(Complaint complaint);

    void deleteComplaintById(Long id);
    void saveToDb(Complaint complaint);

    Complaint getComplaintById(Long id) throws Exception;

    Page<Complaint> getPaginatedComplaints(Pageable pageable);
}
