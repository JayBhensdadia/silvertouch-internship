package com.jaybhensdadia.hrms.service;

import com.jaybhensdadia.hrms.entity.DocumentCategory;

import java.util.List;

public interface DocumentCategoryService {

    List<DocumentCategory> fetchAllDocumentCategories();

    public void saveDocumentCategoryService(DocumentCategory DocumentCategory);

    public DocumentCategory fetchDcById(Long empId);

    public void deleteDcById(Long empId);
}
