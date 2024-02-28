package com.jaybhensdadia.hrms.controller;

import com.jaybhensdadia.hrms.entity.Family;
import com.jaybhensdadia.hrms.service.FamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/families")
public class FamilyController {

    @Autowired
    private FamilyService familyService;

    @GetMapping("/family-form")
    public String showFamilyForm(Model model) {
        model.addAttribute("form", "family");
        model.addAttribute("family", new Family());
        return "home";
    }

    @PostMapping("/addFamily")
    public String saveFamily(@ModelAttribute("family") Family family) {
        familyService.saveFamily(family);
        return "redirect:/emergencies/emergency-form";
    }

    @GetMapping("/edit/{familyId}")
    public String showEditForm(@PathVariable Long familyId, Model model) {
        Family family = familyService.getFamilyById(familyId);
        model.addAttribute("family", family);
        return "family/form";
    }

    @PostMapping("/edit/{familyId}")
    public String updateFamily(@PathVariable Long familyId, @ModelAttribute("family") Family family) {
        family.setFamilyId(familyId);
        familyService.saveFamily(family);
        return "redirect:/families";
    }

//    @GetMapping("/delete/{familyId}")
//    public String deleteFamily(@PathVariable Long familyId) {
//        familyService.deleteFamily(familyId);
//        return "redirect:/families";
//    }
}
