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
import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties.Authentication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jaybhensdadia.foodorder.entities.City;
import com.jaybhensdadia.foodorder.entities.User;
import com.jaybhensdadia.foodorder.generator.PdfGenerator;
import com.jaybhensdadia.foodorder.repositories.UserRepo;
import com.jaybhensdadia.foodorder.services.AreaService;
import com.jaybhensdadia.foodorder.services.CityService;

import jakarta.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestBody;





@Controller
public class HelloController {


    @Autowired
    CityService cityService;


    @Autowired
    AreaService areaService;


    @Autowired
    UserRepo userRepo;
    
    @GetMapping("/")
    public String home(Principal principal, Model model) {
        String username = principal.getName();

        //get user of username from db
        Optional<User> user = userRepo.findByEmail(username);

        //check role
        
        model.addAttribute("role", user.get().getRole());
        // model.addAttribute("role", "RESTAURANT");
        return "home";
    }


    @GetMapping("/signin")
    public String signin() {
        System.out.println("hello");
        return "sign-in";
    }

    @GetMapping("/signup")
    public String signup(Model model) {
        model.addAttribute("cities", cityService.getAllCities());

        model.addAttribute("areas",areaService.getAllAreas());
        return "add-restaurant";
    }
    

    @GetMapping("/dashboard")
    public String dashboard(Model model, Principal principal) {
        String username = principal.getName();

        //get user of username from db
        Optional<User> user = userRepo.findByEmail(username);

        model.addAttribute("role", user.get().getRole());
        model.addAttribute("page", "dashboard");
        return "home";
    }
    

    @GetMapping("/manage-city")
    public String manageCity(Model model) {

        // List<City> list = cityService.getAllCities();
        // model.addAttribute("role", "ADMIN");
        // model.addAttribute("page", "manage-city");
        // model.addAttribute("cities", list);
        return "redirect:/page/1";
    }
    
    @GetMapping("/pdf")
  public void generatePDf(HttpServletResponse response) throws IOException {
    System.out.println("hi there ---------------------------------------------------");
    response.setContentType("application/pdf");
    DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD:HH:MM:SS");
    String currentDateTime = dateFormat.format(new Date());
    String headerkey = "Content-Disposition";
    String headervalue = "attachment; filename=city" + currentDateTime + ".pdf";
    response.setHeader(headerkey, headervalue);
    PdfGenerator generator = new PdfGenerator();
    generator.generatePdfForCity(cityService.getAllCities(), response);
    
  }

    @GetMapping("/add-city")
    public String addCity(Model model) {
        model.addAttribute("page", "add-city");
        return "home";
    }
    

    @PostMapping("/add-city-to-db")
    public String addCityToDb(@ModelAttribute City city){
        cityService.addCity(city);
        return "redirect:/manage-city";
    }


    @GetMapping("/edit-city/{id}")
    public String editCity(Model model, @PathVariable String id) throws Exception {
        
        
        City city = cityService.getCityById(Long.parseLong(id));
        model.addAttribute("city", city);
        model.addAttribute("page", "edit-city");
        return "home";
    }
    

    @PostMapping("/update-city/{id}")
    public String updateCity(@PathVariable String id, @ModelAttribute City city) throws Exception{
        
        City oldCity = cityService.getCityById(Long.parseLong(id));
        
        oldCity.setCityName(city.getCityName());
        oldCity.setDescription(city.getDescription());

        cityService.saveToDb(oldCity);

        return "redirect:/manage-city";
    }
    

    @GetMapping("/delete-city/{id}")    
    public String deleteCity(@PathVariable String id) {
        cityService.deleteCityById(Long.parseLong(id));
        return "redirect:/manage-city";
    }
    
    


    


    @GetMapping("/manage-category")
    public String manageCategory(Model model) {
        model.addAttribute("page", "manage-category");
        return "home";
    }

    @GetMapping("/manage-subcategory")
    public String manageSubCategory(Model model) {
        model.addAttribute("page", "manage-subcategory");
        return "home";
    }

    @GetMapping("/manage-restaurant")
    public String manageRestaurant(Model model) {
        model.addAttribute("page", "manage-restaurant");
        return "home";
    }

    @GetMapping("/manage-offers")
    public String manageOffers(Model model) {
        model.addAttribute("page", "manage-offers");
        return "home";
    }

    @GetMapping("/manage-complaints")
    public String manageComplaints(Model model) {
        model.addAttribute("page", "manage-complaints");
        return "home";
    }



    @GetMapping("/page/{page}")
  public String mangeCityPaged(Model model, @PathVariable("page") int page){
    int currentPage = page;
    int pageSize = 5;
    Page<City> cityPage = cityService.getPaginatedCities(PageRequest.of(currentPage-1,pageSize));
    int totalPages = cityPage.getTotalPages();
    if (totalPages > 0) {
      List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages)
        .boxed()
        .collect(Collectors.toList());
      model.addAttribute("pageNumbers", pageNumbers);
    }
    model.addAttribute("currentPage", currentPage);
    model.addAttribute("totalPages", totalPages);
    model.addAttribute("totalItems", cityPage.getTotalElements());
    model.addAttribute("cities",cityPage.getContent());
    model.addAttribute("role", "ADMIN");
    model.addAttribute("page", "manage-city");
    return "home";
  }
    
}
