package com.jaybhensdadia.foodorder.services;

import java.security.Principal;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.jaybhensdadia.foodorder.entities.City;
import com.jaybhensdadia.foodorder.entities.Product;

public interface ProductService {
    List<Product> getAllProducts();
    void addProduct(Product product);

    Product getProductById(Long id) throws Exception;
    void saveToDb(Product product);
    
    void deleteProductById(Long id);
    Page<Product> getPaginatedProduct(Pageable pageable, Principal principal);

}
