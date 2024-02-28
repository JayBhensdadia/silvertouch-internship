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

import com.jaybhensdadia.foodorder.entities.Category;
import com.jaybhensdadia.foodorder.repositories.CategoryRepo;

@Service
public class CategoryServiceImpl implements CategoryService{
    
    @Autowired
    CategoryRepo categoryRepo;

    @Override
    public List<Category> getAllCategories() {
        return categoryRepo.findAll();
    }

    @Override
    public void addCategory(Category category) {
        categoryRepo.save(category);
    }

    @Override
    public Category getCategoryById(Long id) throws Exception {
        Optional<Category> category = categoryRepo.findById(id);
        if(!category.isPresent()){throw new Exception("category not available");}
        return category.get();
    }

    @Override
    public void saveToDb(Category category) {
        categoryRepo.save(category);
    }

    @Override
    public void deleteCategoryById(Long id) {
        categoryRepo.deleteById(id);
    }


    @Override
    public Page<Category> getPaginatedCategories(Pageable pageable) {
        int pageSize = pageable.getPageSize();
        int currentPage = pageable.getPageNumber();
        int startItem = currentPage * pageSize;
        List<Category> categories = categoryRepo.findAll();
        List<Category> list;

        if(categories.size() < startItem)
            list = Collections.emptyList();
        else{
            int toIndex = Math.min(startItem + pageSize, categories.size());
            list = categories.subList(startItem, toIndex);
        }

        Page<Category> categoryPage = new PageImpl<>(list, PageRequest.of(currentPage,pageSize),categories.size());
        return categoryPage;
    }

}
