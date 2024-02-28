package com.jaybhensdadia.hrms.service;

import com.jaybhensdadia.hrms.repository.DocumentCategoryRepository;
import com.jaybhensdadia.hrms.entity.DocumentCategory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentCategoryServiceImplementation implements DocumentCategoryService{

    private DocumentCategoryRepository documentCategoryRepository;

    @Override
    public List<DocumentCategory> fetchAllDocumentCategories() {
        return documentCategoryRepository.findAll();
    }

    @Override
    public void saveDocumentCategoryService(DocumentCategory documentCategory) {
        documentCategoryRepository.save(documentCategory);
    }

    @Override
    public DocumentCategory fetchDcById(Long empId) {
        return documentCategoryRepository.findByEmpId(empId);
    }

    @Override
    public void deleteDcById(Long empId) {
        documentCategoryRepository.deleteByEmpId(empId);
    }
}
