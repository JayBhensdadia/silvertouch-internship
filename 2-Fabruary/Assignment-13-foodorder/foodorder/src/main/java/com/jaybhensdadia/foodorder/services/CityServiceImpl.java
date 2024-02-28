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

import com.jaybhensdadia.foodorder.entities.City;
import com.jaybhensdadia.foodorder.repositories.CityRepo;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    CityRepo cityRepo;

    @Override
    public List<City> getAllCities() {
        return cityRepo.findAll();
    }

    @Override
    public void addCity(City city) {
        cityRepo.save(city);
    }

    @Override
    public City getCityById(Long id) throws Exception {
        Optional<City> city = cityRepo.findById(id);
        if (!city.isPresent()) {
            throw new Exception("city not found");
        }
        return city.get();
    }

    @Override
    public void saveToDb(City city) {
        cityRepo.save(city);
    }

    @Override
    public void deleteCityById(Long id) {
        cityRepo.deleteById(id);
    }

    @Override
    public Page<City> getPaginatedCities(Pageable pageable) {
        int pageSize = pageable.getPageSize();
        int currentPage = pageable.getPageNumber();
        int startItem = currentPage * pageSize;
        List<City> cities = cityRepo.findAll();
        List<City> list;

        if (cities.size() < startItem)
            list = Collections.emptyList();
        else {
            int toIndex = Math.min(startItem + pageSize, cities.size());
            list = cities.subList(startItem, toIndex);
        }

        Page<City> cityPage = new PageImpl<>(list, PageRequest.of(currentPage, pageSize), cities.size());
        return cityPage;
    }
}
