package com.jaybhensdadia.foodorder.controller;

import java.io.IOException;
import java.security.Principal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jaybhensdadia.foodorder.entities.Area;
import com.jaybhensdadia.foodorder.entities.Product;
import com.jaybhensdadia.foodorder.entities.Restaurant;
import com.jaybhensdadia.foodorder.entities.SubCategory;
import com.jaybhensdadia.foodorder.entities.User;
import com.jaybhensdadia.foodorder.generator.PdfGenerator;
import com.jaybhensdadia.foodorder.repositories.RestaurantRepo;
import com.jaybhensdadia.foodorder.repositories.UserRepo;
import com.jaybhensdadia.foodorder.services.AreaService;
import com.jaybhensdadia.foodorder.services.CityService;
import com.jaybhensdadia.foodorder.services.RestaurantService;

import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/restaurant")
public class RestaurantController {
    

    @Autowired
    RestaurantService restaurantService;


    @Autowired
    AreaService areaService;

    @Autowired
    CityService cityService;


    @Autowired
    UserRepo userRepo;


    @GetMapping("/manage-restaurant")
    public String manageArea(Model model) {
        // model.addAttribute("role", "ADMIN");
        // model.addAttribute("page", "manage-restaurant");
        // model.addAttribute("restaurants", restaurantService.getAllRestaurants());
        return "redirect:/restaurant/page/1";
    }


     @GetMapping("/add-restaurant")
    public String addArea(Model model) {
        model.addAttribute("page", "add-restaurant");
        model.addAttribute("cities", cityService.getAllCities());

        model.addAttribute("areas",areaService.getAllAreas());
        return "home";
    }

    @PostMapping("/add-restaurant-to-db")
    public String addAreaToDb(@ModelAttribute Restaurant restaurant) {
        
        
        User user = new User(restaurant.getEmail(),new BCryptPasswordEncoder().encode(restaurant.getPassword()));
        userRepo.save(user);
        
        restaurant.setUserId(userRepo.findByEmail(restaurant.getEmail()).get().getId());
        restaurantService.addRestaurant(restaurant);
        return "redirect:/restaurant/manage-restaurant";
    }


    @GetMapping("/delete-restaurant/{id}")    
    public String deleteCity(@PathVariable String id) {
        restaurantService.deleteRestaurantById(Long.parseLong(id));
        return "redirect:/restaurant/manage-restaurant";
    }


    
    @GetMapping("/edit-restaurant/{id}")
    public String editCity(Model model, @PathVariable String id) throws Exception {
        
        Restaurant restaurant = restaurantService.getRestaurantById(Long.parseLong(id));
        model.addAttribute("restaurant", restaurant);
        model.addAttribute("page", "edit-restaurant");
        return "home";
    }

    @PostMapping("/update-restaurant/{id}")
    public String updateCity(@PathVariable String id, @ModelAttribute Restaurant restaurant) throws Exception{
        
        Restaurant oldRestaurant = restaurantService.getRestaurantById(Long.parseLong(id));
        
        oldRestaurant.setName(restaurant.getName());
        oldRestaurant.setCityName(restaurant.getCityName());
        oldRestaurant.setAreaName(restaurant.getAreaName());
        oldRestaurant.setEmail(restaurant.getEmail());
        oldRestaurant.setContactNo(restaurant.getContactNo());
        oldRestaurant.setAddress(restaurant.getAddress());
        oldRestaurant.setPassword(restaurant.getPassword());

        restaurantService.saveToDb(oldRestaurant);

        return "redirect:/restaurant/manage-restaurant";
    }


    @GetMapping("/pdf")
    public void generatePDf(HttpServletResponse response) throws IOException {
        response.setContentType("application/pdf");
        DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD:HH:MM:SS");
        String currentDateTime = dateFormat.format(new Date());
        String headerkey = "Content-Disposition";
        String headervalue = "attachment; filename=restaurant" + currentDateTime + ".pdf";
        response.setHeader(headerkey, headervalue);
        PdfGenerator generator = new PdfGenerator();
        generator.generatePdfForRestaurant(restaurantService.getAllRestaurants(), response);
    }

    @GetMapping("/page/{page}")
    public String manageResturantPaged(Model model, @PathVariable("page") int page, Principal principal){

        int currentPage = page;
        int pageSize = 5;
        Page<Restaurant> restaurantPage = restaurantService.getPaginatedRestaurants(PageRequest.of(currentPage-1,pageSize));
        int totalPages = restaurantPage.getTotalPages();
        if (totalPages > 0) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages)
              .boxed()
              .collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }
        model.addAttribute("currentPage", currentPage);
        model.addAttribute("totalPages", totalPages);
        model.addAttribute("totalItems", restaurantPage.getTotalElements());
        model.addAttribute("restaurants",restaurantPage.getContent());
        // model.addAttribute("role", "ADMIN");
        model.addAttribute("page", "manage-restaurant");

        String username = principal.getName();

        //get user of username from db
        Optional<User> user = userRepo.findByEmail(username);

        model.addAttribute("role", user.get().getRole());

        return "home";
    }

}
