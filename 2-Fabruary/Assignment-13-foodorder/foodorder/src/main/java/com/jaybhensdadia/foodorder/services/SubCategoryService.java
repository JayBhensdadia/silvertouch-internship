package com.jaybhensdadia.foodorder.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.jaybhensdadia.foodorder.entities.SubCategory;

public interface SubCategoryService {
    
  


     List<SubCategory> getAllSubCategories();
     void addSubCategory(SubCategory subCategory);
     SubCategory getSubCategoryById(Long id) throws Exception;
     void saveToDb(SubCategory subCategory);
     void deleteSubCategoryById(Long id);
     Page<SubCategory> getPaginatedSubCategories(Pageable pageable);
}
