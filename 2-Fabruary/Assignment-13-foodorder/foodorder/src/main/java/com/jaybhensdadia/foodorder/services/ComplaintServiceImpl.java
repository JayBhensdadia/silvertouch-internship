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

import com.jaybhensdadia.foodorder.entities.Complaint;
import com.jaybhensdadia.foodorder.repositories.ComplaintRepo;

@Service
public class ComplaintServiceImpl implements ComplaintService{
    
    @Autowired
    ComplaintRepo complaintRepo;

    @Override
    public List<Complaint> getAllComplaints() {
        return complaintRepo.findAll();
    }

    @Override
    public void addComplaint(Complaint complaint) {
        complaintRepo.save(complaint);
    }


    @Override
    public void deleteComplaintById(Long id) {
        complaintRepo.deleteById(id);
    }


    @Override
    public Complaint getComplaintById(Long id) throws Exception {
        Optional<Complaint> complaint = complaintRepo.findById(id);
        if(!complaint.isPresent()){throw new Exception("complaint not found");}
        return complaint.get();
    }


    @Override
    public void saveToDb(Complaint complaint) {
        complaintRepo.save(complaint);
    }
    

    @Override
    public Page<Complaint> getPaginatedComplaints(Pageable pageable) {
        int pageSize = pageable.getPageSize();
        int currentPage = pageable.getPageNumber();
        int startItem = currentPage * pageSize;
        List<Complaint> complaints = complaintRepo.findAll();
        List<Complaint> list;

        if(complaints.size() < startItem)
            list = Collections.emptyList();
        else{
            int toIndex = Math.min(startItem + pageSize, complaints.size());
            list = complaints.subList(startItem, toIndex);
        }

        Page<Complaint> complaintPage = new PageImpl<>(list, PageRequest.of(currentPage,pageSize),complaints.size());
        return complaintPage;
    }
}
