package com.jaybhensdadia.hrms.controller;

import com.jaybhensdadia.hrms.entity.PersonalDetails;
import com.jaybhensdadia.hrms.service.PersonalDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/personalDetails")
public class PersonalDetailsController {

    @Autowired
    private PersonalDetailsService personalDetailsService;

//    @GetMapping
//    public String listPersonalDetails(Model model) {
//        List<PersonalDetails> personalDetailsList = personalDetailsService.getAllPersonalDetails();
//        model.addAttribute("personalDetailsList", personalDetailsList);
//        return "personalDetails/list";
//    }

    @GetMapping("/personal-form")
    public String showPersonalDetailsForm(Model model) {
        model.addAttribute("form", "personal");
        model.addAttribute("personalDetails", new PersonalDetails());
        return "home";
    }

    @PostMapping("/addPersonalDetails")
    public String savePersonalDetails(@ModelAttribute("personalDetails") PersonalDetails personalDetails) {
        personalDetailsService.savePersonalDetails(personalDetails);
        return "redirect:/contacts/contact-form";
    }

    @GetMapping("/edit/{personalDetailId}")
    public String showEditForm(@PathVariable Long personalDetailId, Model model) {
        PersonalDetails personalDetails = personalDetailsService.getPersonalDetailsById(personalDetailId);
        model.addAttribute("personalDetails", personalDetails);
        return "personalDetails/form";
    }

    @PostMapping("/edit/{personalDetailId}")
    public String updatePersonalDetails(@PathVariable Long personalDetailId, @ModelAttribute("personalDetails") PersonalDetails personalDetails) {
        personalDetails.setPersonalDetailId(personalDetailId);
        personalDetailsService.savePersonalDetails(personalDetails);
        return "redirect:/personalDetails";
    }

//    @GetMapping("/delete/{personalDetailId}")
//    public String deletePersonalDetails(@PathVariable Long personalDetailId) {
//        personalDetailsService.deletePersonalDetails(personalDetailId);
//        return "redirect:/personalDetails";
//    }
}
