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

import com.jaybhensdadia.foodorder.entities.Area;
import com.jaybhensdadia.foodorder.entities.User;
import com.jaybhensdadia.foodorder.entities.Category;
import com.jaybhensdadia.foodorder.entities.User;
import com.jaybhensdadia.foodorder.generator.PdfGenerator;
import com.jaybhensdadia.foodorder.repositories.UserRepo;
import com.jaybhensdadia.foodorder.services.AreaService;
import com.jaybhensdadia.foodorder.services.CategoryService;

import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/category")
public class CategoryController {
    

    
    @Autowired
    CategoryService categoryService;

    @Autowired
    UserRepo userRepo;

    @GetMapping("/manage-category")
    public String manageArea(Model model) {
        // model.addAttribute("role", "ADMIN");
        // model.addAttribute("page", "manage-category");
        // model.addAttribute("categories", categoryService.getAllCategories());
        return "redirect:/category/page/1";
    }
    

    @GetMapping("/add-category")
    public String addArea(Model model) {
        model.addAttribute("page", "add-category");
        return "home";
    }

    @PostMapping("/add-category-to-db")
    public String addAreaToDb(@ModelAttribute Category category) {
        categoryService.addCategory(category);
        return "redirect:/category/manage-category";
    }


    @GetMapping("/delete-category/{id}")    
    public String deleteCity(@PathVariable String id) {
        categoryService.deleteCategoryById(Long.parseLong(id));
        return "redirect:/category/manage-category";
    }



    @GetMapping("/edit-category/{id}")
    public String editCity(Model model, @PathVariable String id) throws Exception {
        
        
        Category category = categoryService.getCategoryById(Long.parseLong(id));
        model.addAttribute("category", category);
        model.addAttribute("page", "edit-category");
        return "home";
    }

    @PostMapping("/update-category/{id}")
    public String updateCity(@PathVariable String id, @ModelAttribute Category category) throws Exception{
        
        Category oldCategory = categoryService.getCategoryById(Long.parseLong(id));
        
        oldCategory.setCategoryName(category.getCategoryName());

        oldCategory.setDescription(category.getDescription());

        categoryService.saveToDb(oldCategory);

        return "redirect:/category/manage-category";
    }


    @GetMapping("/pdf")
    public void generatePDf(HttpServletResponse response) throws IOException {
        response.setContentType("application/pdf");
        DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD:HH:MM:SS");
        String currentDateTime = dateFormat.format(new Date());
        String headerkey = "Content-Disposition";
        String headervalue = "attachment; filename=category" + currentDateTime + ".pdf";
        response.setHeader(headerkey, headervalue);
        PdfGenerator generator = new PdfGenerator();
        generator.generatePdfForCategory(categoryService.getAllCategories(), response);
    }



     @GetMapping("/page/{page}")
    public String mangeCategoryPaged(Model model, @PathVariable("page") int page, Principal principal){

        int currentPage = page;
        int pageSize = 5;
        Page<Category> categoryPage = categoryService.getPaginatedCategories(PageRequest.of(currentPage-1,pageSize));
        int totalPages = categoryPage.getTotalPages();
        if (totalPages > 0) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages)
                    .boxed()
                    .collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }
        model.addAttribute("currentPage", currentPage);
        model.addAttribute("totalPages", totalPages);
        model.addAttribute("totalItems", categoryPage.getTotalElements());
        model.addAttribute("categories",categoryPage.getContent());
        
        model.addAttribute("page", "manage-category");


        String username = principal.getName();

        //get user of username from db
        Optional<User> user = userRepo.findByEmail(username);

        model.addAttribute("role", user.get().getRole());

        return "home";
    }


}
