package com.jaybhensdadia.foodorder.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.jaybhensdadia.foodorder.entities.Category;

public interface CategoryService {
    
    

     List<Category> getAllCategories();
     void addCategory(Category category);
     Category getCategoryById(Long id) throws Exception;
     void saveToDb(Category category);
     void deleteCategoryById(Long id);
     Page<Category> getPaginatedCategories(Pageable pageable);
}
