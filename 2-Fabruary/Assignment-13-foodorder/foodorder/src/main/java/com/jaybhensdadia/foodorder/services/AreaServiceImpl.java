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

import com.jaybhensdadia.foodorder.entities.Area;
import com.jaybhensdadia.foodorder.repositories.AreaRepo;

@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    AreaRepo areaRepo;

    @Override
    public List<Area> getAllAreas() {
        return areaRepo.findAll();
    }

    @Override
    public void addArea(Area area) {
        areaRepo.save(area);
    }

    @Override
    public Area getAreaById(Long id) throws Exception {
        Optional<Area> area = areaRepo.findById(id);
        if (!area.isPresent()) {
            throw new Exception("area not found");
        }
        return area.get();
    }

    @Override
    public void saveToDb(Area area) {
        areaRepo.save(area);
    }

    @Override
    public void deleteAreaById(Long id) {
        areaRepo.deleteById(id);
    }

    @Override
    public Page<Area> getPaginatedAreas(Pageable pageable) {
        int pageSize = pageable.getPageSize();
        int currentPage = pageable.getPageNumber();
        int startItem = currentPage * pageSize;
        List<Area> areas = areaRepo.findAll();
        List<Area> list;

        if (areas.size() < startItem)
            list = Collections.emptyList();
        else {
            int toIndex = Math.min(startItem + pageSize, areas.size());
            list = areas.subList(startItem, toIndex);
        }

        Page<Area> areaPage = new PageImpl<>(list, PageRequest.of(currentPage, pageSize), areas.size());
        return areaPage;
    }
}
