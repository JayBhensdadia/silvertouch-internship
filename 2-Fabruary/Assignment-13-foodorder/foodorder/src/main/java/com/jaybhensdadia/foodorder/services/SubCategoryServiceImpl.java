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

import com.jaybhensdadia.foodorder.entities.SubCategory;
import com.jaybhensdadia.foodorder.repositories.SubCategoryRepo;

@Service
public class SubCategoryServiceImpl implements SubCategoryService{


    @Autowired
    SubCategoryRepo subCategoryRepo;

    @Override
    public List<SubCategory> getAllSubCategories() {
        return subCategoryRepo.findAll();
    }

    @Override
    public void addSubCategory(SubCategory subCategory) {
        subCategoryRepo.save(subCategory);
    }

    @Override
    public SubCategory getSubCategoryById(Long id) throws Exception {
        Optional<SubCategory> subCategory = subCategoryRepo.findById(id);
        if(!subCategory.isPresent()){throw new Exception("sub category does not exists");}
        return subCategory.get();
    }

    @Override
    public void saveToDb(SubCategory subCategory) {
        subCategoryRepo.save(subCategory);
    }

    @Override
    public void deleteSubCategoryById(Long id) {
        subCategoryRepo.deleteById(id);
    }
    

    @Override
    public Page<SubCategory> getPaginatedSubCategories(Pageable pageable) {
        int pageSize = pageable.getPageSize();
        int currentPage = pageable.getPageNumber();
        int startItem = currentPage * pageSize;
        List<SubCategory> subCategories = subCategoryRepo.findAll();
        List<SubCategory> list;

        if(subCategories.size() < startItem)
            list = Collections.emptyList();
        else{
            int toIndex = Math.min(startItem + pageSize, subCategories.size());
            list = subCategories.subList(startItem, toIndex);
        }

        Page<SubCategory> subCategoryPage = new PageImpl<>(list, PageRequest.of(currentPage,pageSize),subCategories.size());
        return subCategoryPage;
    }
}
