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
import org.springframework.web.bind.annotation.RequestMapping;

import com.jaybhensdadia.foodorder.entities.Offer;
import com.jaybhensdadia.foodorder.entities.Product;
import com.jaybhensdadia.foodorder.entities.User;
import com.jaybhensdadia.foodorder.generator.PdfGenerator;
import com.jaybhensdadia.foodorder.repositories.UserRepo;
import com.jaybhensdadia.foodorder.services.ProductService;

import jakarta.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/product")
public class ProductController {
    

    @Autowired
    ProductService productService;

    @Autowired
    UserRepo userRepo;


    @GetMapping("/manage-products")
    public String manageProducts(Model model) {
        
        model.addAttribute("role", "RESTAURANT");
        model.addAttribute("page", "manage-products");
        model.addAttribute("products", productService.getAllProducts());
        return "home";

    }


    @GetMapping("/add-product")
    public String addArea(Model model) {
        model.addAttribute("page", "add-product");
        return "home";
    }

    @PostMapping("/add-product-to-db")
    public String addAreaToDb(@ModelAttribute Product product){

        productService.addProduct(product);
        return "redirect:/product/manage-products";
    }


    @GetMapping("/delete-product/{id}")
    public String getMethodName(@PathVariable("id") String id) {
        productService.deleteProductById(Long.parseLong(id));
        return "redirect:/product/manage-products";
    }


    
    @GetMapping("/edit-product/{id}")
    public String editCity(Model model, @PathVariable String id) throws Exception {
        
        Product product = productService.getProductById(Long.parseLong(id));
        model.addAttribute("product", product);
        model.addAttribute("page", "edit-product");
        return "home";
    }

    @PostMapping("/update-product/{id}")
    public String updateCity(@PathVariable String id, @ModelAttribute Product product) throws Exception{
        
        Product oldProduct = productService.getProductById(Long.parseLong(id));
        
       
        oldProduct.setRestaurantId(product.getRestaurantId());
        oldProduct.setCategoryName(product.getCategoryName());
        oldProduct.setSubCategoryName(product.getSubCategoryName());
        oldProduct.setProductName(product.getProductName());
        oldProduct.setPrice(product.getPrice());
        oldProduct.setDescription(product.getDescription());

        productService.saveToDb(oldProduct);

        return "redirect:/product/manage-products";
    }
    

    @GetMapping("/pdf")
    public void generatePDf(HttpServletResponse response) throws IOException {
        response.setContentType("application/pdf");
        DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD:HH:MM:SS");
        String currentDateTime = dateFormat.format(new Date());
        String headerkey = "Content-Disposition";
        String headervalue = "attachment; filename=product" + currentDateTime + ".pdf";
        response.setHeader(headerkey, headervalue);
        PdfGenerator generator = new PdfGenerator();
        generator.generatePdfForProduct(productService.getAllProducts(), response);
    }
    

    @GetMapping("/page/{page}")
    public String mangeProductPaged(Model model, @PathVariable("page") int page, Principal principal){

        String username = principal.getName();

        //get user of username from db
        Optional<User> user = userRepo.findByEmail(username);

        model.addAttribute("role", user.get().getRole());

        int currentPage = page;
        int pageSize = 5;
        Page<Product> productPage = productService.getPaginatedProduct(PageRequest.of(currentPage-1,pageSize),principal);


        int totalPages = productPage.getTotalPages();
        if (totalPages > 0) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages)
              .boxed()
              .collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }
        model.addAttribute("currentPage", currentPage);
        model.addAttribute("totalPages", totalPages);
        model.addAttribute("totalItems", productPage.getTotalElements());

       

        model.addAttribute("products",productPage.getContent());
        // model.addAttribute("role", "RESTAURANT");
        model.addAttribute("page", "manage-products");


        

        return "home";
    }
    
}
