package com.jaybhensdadia.foodorder.controller;

import java.io.IOException;
import java.security.Principal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jaybhensdadia.foodorder.entities.Category;
import com.jaybhensdadia.foodorder.entities.SubCategory;
import com.jaybhensdadia.foodorder.entities.User;
import com.jaybhensdadia.foodorder.generator.PdfGenerator;
import com.jaybhensdadia.foodorder.repositories.UserRepo;
import com.jaybhensdadia.foodorder.services.CategoryService;
import com.jaybhensdadia.foodorder.services.SubCategoryService;

import jakarta.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/subcategory")
public class SubCategoryController {
    
    @Autowired
    SubCategoryService subCategoryService;

    @Autowired
    CategoryService categoryService;

    @Autowired
    UserRepo userRepo;


    @GetMapping("/manage-subcategory")
    public String manageArea(Model model) {
        // model.addAttribute("role", "ADMIN");
        // model.addAttribute("page", "manage-subcategory");
        // model.addAttribute("subcategories", subCategoryService.getAllSubCategories());
        return "redirect:/subcategory/page/1";
    }

    @GetMapping("/add-subcategory")
    public String addArea(Model model) {
        model.addAttribute("page", "add-subcategory");
        model.addAttribute("categories", categoryService.getAllCategories());
        return "home";
    }

    @PostMapping("/add-subcategory-to-db")
    public String addAreaToDb(@ModelAttribute SubCategory subCategory) {
        subCategoryService.addSubCategory(subCategory);
        return "redirect:/subcategory/manage-subcategory";
    }

    @GetMapping("/delete-subcategory/{id}")    
    public String deleteCity(@PathVariable String id) {
        subCategoryService.deleteSubCategoryById(Long.parseLong(id));
        return "redirect:/subcategory/manage-subcategory";
    }

    

    @GetMapping("/edit-subcategory/{id}")
    public String editCity(Model model, @PathVariable String id) throws Exception {
        
        SubCategory subCategory = subCategoryService.getSubCategoryById(Long.parseLong(id));
        model.addAttribute("subcategory", subCategory);
        model.addAttribute("page", "edit-subcategory");
        return "home";
    }

    @PostMapping("/update-subcategory/{id}")
    public String updateCity(@PathVariable String id, @ModelAttribute SubCategory subCategory) throws Exception{
        
        SubCategory oldSubCategory = subCategoryService.getSubCategoryById(Long.parseLong(id));
        
        oldSubCategory.setCategoryName(subCategory.getCategoryName());
        oldSubCategory.setSubCategoryName(subCategory.getSubCategoryName());

        oldSubCategory.setDescription(subCategory.getDescription());

        subCategoryService.saveToDb(oldSubCategory);

        return "redirect:/subcategory/manage-subcategory";
    }


    @GetMapping("/pdf")
    public void generatePDf(HttpServletResponse response) throws IOException {
        response.setContentType("application/pdf");
        DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD:HH:MM:SS");
        String currentDateTime = dateFormat.format(new Date());
        String headerkey = "Content-Disposition";
        String headervalue = "attachment; filename=subcategory" + currentDateTime + ".pdf";
        response.setHeader(headerkey, headervalue);
        PdfGenerator generator = new PdfGenerator();
        generator.generatePdfForSubCategory(subCategoryService.getAllSubCategories(), response);
    }

    @GetMapping("/page/{page}")
    public String mangeSubCategoryPaged(Model model, @PathVariable("page") int page, Principal principal){

        int currentPage = page;
        int pageSize = 5;
        Page<SubCategory> subCategoryPage = subCategoryService.getPaginatedSubCategories(PageRequest.of(currentPage-1,pageSize));
        int totalPages = subCategoryPage.getTotalPages();
        if (totalPages > 0) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages)
                    .boxed()
                    .collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }
        model.addAttribute("currentPage", currentPage);
        model.addAttribute("totalPages", totalPages);
        model.addAttribute("totalItems", subCategoryPage.getTotalElements());
        model.addAttribute("subcategories",subCategoryPage.getContent());
        // model.addAttribute("role", "ADMIN");
        model.addAttribute("page", "manage-subcategory");

        String username = principal.getName();

        //get user of username from db
        Optional<User> user = userRepo.findByEmail(username);

        model.addAttribute("role", user.get().getRole());

        return "home";
    }

}
