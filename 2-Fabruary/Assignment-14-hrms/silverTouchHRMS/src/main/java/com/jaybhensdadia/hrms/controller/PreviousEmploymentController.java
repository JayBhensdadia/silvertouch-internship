package com.jaybhensdadia.hrms.controller;


import com.jaybhensdadia.hrms.entity.PreviousEmployeement;
import com.jaybhensdadia.hrms.service.PreviousEmployeementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/previousEmployments")
public class PreviousEmploymentController {

    @Autowired
    private PreviousEmployeementService previousEmploymentService;

    @GetMapping
    public String listPreviousEmployments(Model model) {
        List<PreviousEmployeement> previousEmploymentList = previousEmploymentService.fetchAllPreviousEmployeement();
        model.addAttribute("previousEmploymentList", previousEmploymentList);
        return "employment/previousEmployment/list";
    }

    @GetMapping("/prev-emp")
    public String showPreviousEmploymentForm(Model model) {
        model.addAttribute("form", "previousEmployment");
        model.addAttribute("previousEmployment", new PreviousEmployeement());
        return "form";
    }

    @PostMapping("/addPrevEmp")
    public String savePreviousEmployment(@ModelAttribute("previousEmployment") PreviousEmployeement previousEmployment) {
        previousEmploymentService.saveJob(previousEmployment);
        return "redirect:/qualifications/quali-form";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable long id, Model model) {
        PreviousEmployeement previousEmployment = previousEmploymentService.fetchById(id);
        model.addAttribute("previousEmployment", previousEmployment);
        return "employment/previousEmployment/form";
    }

    @PostMapping("/edit/{id}")
    public String updatePreviousEmployment(@PathVariable long id, @ModelAttribute("previousEmployment") PreviousEmployeement previousEmployment) {
        previousEmployment.setId(id);
        previousEmploymentService.saveJob(previousEmployment);
        return "redirect:/previousEmployments";
    }

    @GetMapping("/delete/{id}")
    public String deletePreviousEmployment(@PathVariable long id) {
        previousEmploymentService.deletePreviousEmployeement(id);
        return "redirect:/previousEmployments";
    }
}
