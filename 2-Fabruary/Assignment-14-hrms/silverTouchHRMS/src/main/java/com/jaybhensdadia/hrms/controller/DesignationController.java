package com.jaybhensdadia.hrms.controller;

import com.jaybhensdadia.hrms.entity.Designation;
import com.jaybhensdadia.hrms.service.DesignationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/designations")
public class DesignationController {

    @Autowired
    private DesignationService designationService;

//    @GetMapping
//    public String listDesignations(Model model) {
//        List<Designation> designations = designationService.getAllDesignations();
//        model.addAttribute("designations", designations);
//        return "designation/list";
//    }

    @GetMapping("/new")
    public String showDesignationForm(Model model) {
        model.addAttribute("designation", new Designation());
        return "designation/form";
    }

    @PostMapping("/new")
    public String saveDesignation(@ModelAttribute("designation") Designation designation) {
        designationService.saveDesignation(designation);
        return "redirect:/designations";
    }

    @GetMapping("/edit/{designationId}")
    public String showEditForm(@PathVariable Long designationId, Model model) {
        Designation designation = designationService.getDesignationById(designationId);
        model.addAttribute("designation", designation);
        return "designation/form";
    }

    @PostMapping("/edit/{designationId}")
    public String updateDesignation(@PathVariable Long designationId, @ModelAttribute("designation") Designation designation) {
        designation.setDesignationId(designationId);
        designationService.saveDesignation(designation);
        return "redirect:/designations";
    }

//    @GetMapping("/delete/{designationId}")
//    public String deleteDesignation(@PathVariable Long designationId) {
//        designationService.deleteDesignation(designationId);
//        return "redirect:/designations";
//    }
}
