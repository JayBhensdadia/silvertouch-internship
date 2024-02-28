package com.jaybhensdadia.foodorder.services;

import java.security.Principal;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.jaybhensdadia.foodorder.entities.Product;
import com.jaybhensdadia.foodorder.entities.User;
import com.jaybhensdadia.foodorder.repositories.ProductRepo;
import com.jaybhensdadia.foodorder.repositories.UserRepo;

@Service    
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepo productRepo;

    @Autowired
    UserRepo userRepo;

    @Override
    public void addProduct(Product product) {
        productRepo.save(product);
    }

    @Override
    public void deleteProductById(Long id) {
        productRepo.deleteById(id);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public Product getProductById(Long id) throws Exception {
        Optional<Product> product = productRepo.findById(id);
        if(!product.isPresent()){throw new Exception("product not available");}
        return product.get();
    }

    @Override
    public void saveToDb(Product product) {
       productRepo.save(product);
    }

    @Override
    public Page<Product> getPaginatedProduct(Pageable pageable, Principal principal) {
        String email = principal.getName();
        User user =  userRepo.findByEmail(email).orElse(null);


        int pageSize = pageable.getPageSize();
        int currentPage = pageable.getPageNumber();
        int startItem = currentPage * pageSize;

        List<Product> products = productRepo.findAll();

        if (user.getRole().equals("RESTAURANT")) {
            products = products.stream().filter(product -> {
                return product.getRestaurantId() == user.getId();
            }).toList();
        }

        
        List<Product> list;

        if(products.size() < startItem)
            list = Collections.emptyList();
        else{
            int toIndex = Math.min(startItem + pageSize, products.size());
            list = products.subList(startItem, toIndex);
        }

        return new PageImpl<>(list, PageRequest.of(currentPage,pageSize),products.size());
    }
    
}
