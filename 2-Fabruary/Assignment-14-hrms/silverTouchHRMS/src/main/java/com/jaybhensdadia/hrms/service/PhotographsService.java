package com.jaybhensdadia.hrms.service;

import com.jaybhensdadia.hrms.entity.Photographs;

import java.util.List;

public interface PhotographsService {

    Photographs getPhotographsById(Long id);
    public void savePhotograph(Photographs photographs);

    public List<Photographs> fetchPhotographsByEmployeeId(Long empId);



    public void deletePhotographsByEmployeeId(Long empId);
}
