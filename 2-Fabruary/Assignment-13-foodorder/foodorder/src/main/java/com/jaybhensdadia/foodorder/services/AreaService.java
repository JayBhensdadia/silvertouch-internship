package com.jaybhensdadia.foodorder.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.jaybhensdadia.foodorder.entities.Area;

public interface AreaService {
    

    List<Area> getAllAreas();

    void addArea(Area area);

    Area getAreaById(Long id) throws Exception;

    void saveToDb(Area area);

    void deleteAreaById(Long id);

    Page<Area> getPaginatedAreas(Pageable pageable);
}
