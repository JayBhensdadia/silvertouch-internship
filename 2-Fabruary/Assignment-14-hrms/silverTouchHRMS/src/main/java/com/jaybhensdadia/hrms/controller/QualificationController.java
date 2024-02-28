package com.jaybhensdadia.hrms.controller;

import com.jaybhensdadia.hrms.entity.Qualification;
import com.jaybhensdadia.hrms.service.QualificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/qualifications")
public class QualificationController {

    @Autowired
    private QualificationService qualificationService;

    @GetMapping
    public String listQualifications(Model model) {
        List<Qualification> qualificationList = qualificationService.fetchAllQualification();
        model.addAttribute("qualificationList", qualificationList);
        return "qualification/list";
    }

    @GetMapping("/quali-form")
    public String showQualificationForm(Model model) {
        model.addAttribute("form", "quali");
        model.addAttribute("qualification", new Qualification());
        return "home";
    }

    @PostMapping("/addQuali")
    public String saveQualification(@ModelAttribute("qualification") Qualification qualification) {
        qualificationService.saveJob(qualification);
        return "redirect:/employee/employeeList";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable long id, Model model) {
        Qualification qualification = qualificationService.fetchById(id);
        model.addAttribute("qualification", qualification);
        return "qualification/form";
    }

    @PostMapping("/edit/{id}")
    public String updateQualification(@PathVariable long id, @ModelAttribute("qualification") Qualification qualification) {
        qualification.setId(id);
        qualificationService.saveJob(qualification);
        return "redirect:/qualifications";
    }

    @GetMapping("/delete/{id}")
    public String deleteQualification(@PathVariable long id) {
        qualificationService.deleteQualification(id);
        return "redirect:/qualifications";
    }
}
