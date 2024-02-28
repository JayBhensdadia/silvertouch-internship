package com.jaybhensdadia.hrms.service;

import com.jaybhensdadia.hrms.repository.PhotographsRepository;
import com.jaybhensdadia.hrms.entity.Photographs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotographsServiceImplementation implements PhotographsService{
    @Autowired
    private PhotographsRepository photographsRepository;

    @Override
    public Photographs getPhotographsById(Long id) {
        return photographsRepository.findById(id).orElseThrow();
    }

    @Override
    public void savePhotograph(Photographs photograph) {
        photographsRepository.save(photograph);
    }

    @Override
    public List<Photographs> fetchPhotographsByEmployeeId(Long empId) {
        return photographsRepository.findPhotographsByEmployeeId(empId);
    }

    @Override
    public void deletePhotographsByEmployeeId(Long empId) {
        photographsRepository.deleteByEmpId(empId);
    }
}
