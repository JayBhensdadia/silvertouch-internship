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
import org.springframework.web.bind.annotation.RequestParam;

import com.jaybhensdadia.foodorder.entities.Offer;
import com.jaybhensdadia.foodorder.entities.SubCategory;
import com.jaybhensdadia.foodorder.entities.User;
import com.jaybhensdadia.foodorder.generator.PdfGenerator;
import com.jaybhensdadia.foodorder.repositories.OfferRepo;
import com.jaybhensdadia.foodorder.repositories.UserRepo;
import com.jaybhensdadia.foodorder.services.OfferService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/offer")
public class OfferController {

    @Autowired
    OfferService offerService;

    @Autowired
    UserRepo userRepo;
    
    @GetMapping("/manage-offer")
    public String manageArea(Model model) {
        // model.addAttribute("role", "ADMIN");
        // // model.addAttribute("role", "RESTAURANT");
        // model.addAttribute("page", "manage-offer");
        // model.addAttribute("offers", offerService.getAllOffers());
        return "redirect:/offer/page/1";
    }

    @GetMapping("/add-offer")
    public String addArea(Model model) {
        model.addAttribute("page", "add-offer");
        return "home";
    }

    @PostMapping("/add-offer-to-db")
    public String addAreaToDb(@ModelAttribute Offer offer){

        offerService.addOffer(offer);
        return "redirect:/offer/manage-offer";
    }

    @GetMapping("/delete-offer/{id}")    
    public String deleteCity(@PathVariable String id) {
        offerService.deleteOfferById(Long.parseLong(id));
        return "redirect:/offer/manage-offer";
    }

    @GetMapping("/edit-offer/{id}")
    public String editCity(Model model, @PathVariable String id) throws Exception {
        
        Offer offer = offerService.getOfferById(Long.parseLong(id));
        model.addAttribute("offer", offer);
        model.addAttribute("page", "edit-offer");
        return "home";
    }

    @PostMapping("/update-offer/{id}")
    public String updateCity(@PathVariable String id, @ModelAttribute Offer offer) throws Exception{
        
        Offer oldOffer = offerService.getOfferById(Long.parseLong(id));
        
       oldOffer.setOfferName(offer.getOfferName());
       oldOffer.setCategoryName(offer.getCategoryName());
       oldOffer.setSubCategoryName(offer.getSubCategoryName());
       oldOffer.setRestaurantName(offer.getRestaurantName());
       oldOffer.setDiscount(offer.getDiscount());
       oldOffer.setDescription(offer.getDescription());
       oldOffer.setStartDate(offer.getStartDate());
       oldOffer.setEndDate(offer.getEndDate());

        offerService.saveToDb(oldOffer);

        return "redirect:/offer/manage-offer";
    }


    @GetMapping("/pdf")
    public void generatePDf(HttpServletResponse response) throws IOException {
        response.setContentType("application/pdf");
        DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD:HH:MM:SS");
        String currentDateTime = dateFormat.format(new Date());
        String headerkey = "Content-Disposition";
        String headervalue = "attachment; filename=complaint" + currentDateTime + ".pdf";
        response.setHeader(headerkey, headervalue);
        PdfGenerator generator = new PdfGenerator();
        generator.generatePdfForOffers(offerService.getAllOffers(), response);
    }



    @GetMapping("/page/{page}")
    public String mangeOfferPaged(Model model, @PathVariable("page") int page,Principal principal){

        int currentPage = page;
        int pageSize = 5;
        Page<Offer> offerPage = offerService.getPaginatedOffers(PageRequest.of(currentPage-1,pageSize));
        int totalPages = offerPage.getTotalPages();
        if (totalPages > 0) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages)
                    .boxed()
                    .collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }
        model.addAttribute("currentPage", currentPage);
        model.addAttribute("totalPages", totalPages);
        model.addAttribute("totalItems", offerPage.getTotalElements());
        model.addAttribute("offers",offerPage.getContent());
        // model.addAttribute("role", "ADMIN");
        // model.addAttribute("role", "RESTAURANT");
        model.addAttribute("page", "manage-offer");

        String username = principal.getName();

        //get user of username from db
        Optional<User> user = userRepo.findByEmail(username);

        model.addAttribute("role", user.get().getRole());


        return "home";
    }

}
