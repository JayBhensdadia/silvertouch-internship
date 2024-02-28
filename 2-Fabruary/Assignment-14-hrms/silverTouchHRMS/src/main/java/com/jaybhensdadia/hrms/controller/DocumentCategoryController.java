package com.jaybhensdadia.hrms.controller;

import com.jaybhensdadia.hrms.entity.DocumentCategory;
import com.jaybhensdadia.hrms.service.DocumentCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/document-categories")
public class DocumentCategoryController {

    @Autowired
    private DocumentCategoryService documentCategoryService;

    @GetMapping
    public String listDocumentCategories(Model model) {
        List<DocumentCategory> documentCategories = documentCategoryService.fetchAllDocumentCategories();
        model.addAttribute("documentCategories", documentCategories);
        return "documentCategory/list";
    }

    @GetMapping("/new")
    public String showDocumentCategoryForm(Model model) {
        model.addAttribute("documentCategory", new DocumentCategory());
        return "documentCategory/form";
    }

    @PostMapping("/new")
    public String saveDocumentCategory(@ModelAttribute("documentCategory") DocumentCategory documentCategory) {
        documentCategoryService.saveDocumentCategoryService(documentCategory);
        return "redirect:/document-categories";
    }

    @GetMapping("/edit/{documentCategoryId}")
    public String showEditForm(@PathVariable Long documentCategoryId, Model model) {
        DocumentCategory documentCategory = documentCategoryService.fetchDcById(documentCategoryId);
        model.addAttribute("documentCategory", documentCategory);
        return "documentCategory/form";
    }

    @PostMapping("/edit/{documentCategoryId}")
    public String updateDocumentCategory(@PathVariable Long documentCategoryId, @ModelAttribute("documentCategory") DocumentCategory documentCategory) {
        documentCategory.setDocumentCategoryId(documentCategoryId);
        documentCategoryService.saveDocumentCategoryService(documentCategory);
        return "redirect:/document-categories";
    }

//    @GetMapping("/delete/{documentCategoryId}")
//    public String deleteDocumentCategory(@PathVariable Long documentCategoryId) {
//        documentCategoryService.deleteDocumentCategory(documentCategoryId);
//        return "redirect:/document-categories";
//    }
}
