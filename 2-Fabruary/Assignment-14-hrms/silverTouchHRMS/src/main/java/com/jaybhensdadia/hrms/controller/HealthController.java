package com.jaybhensdadia.hrms.controller;

import com.jaybhensdadia.hrms.entity.Health;
import com.jaybhensdadia.hrms.service.HealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/healths")
public class HealthController {

    @Autowired
    private HealthService healthService;


    @GetMapping("/health-form")
    public String showHealthForm(Model model) {
        model.addAttribute("form", "health");
        model.addAttribute("health", new Health());
        return "home";
    }

    @PostMapping("/addHealth")
    public String saveHealth(@ModelAttribute("health") Health health) {
        healthService.saveService(health);
        return "redirect:/photographs/photo-form";
    }

    @GetMapping("/edit/{healthId}")
    public String showEditForm(@PathVariable Long healthId, Model model) {
        Health health = healthService.fetchHealthById(healthId);
        model.addAttribute("health", health);
        return "health/form";
    }

    @PostMapping("/edit/{healthId}")
    public String updateHealth(@PathVariable Long healthId, @ModelAttribute("health") Health health) {
        health.setHealthId(healthId);
        healthService.saveService(health);
        return "redirect:/healths";
    }

//    @GetMapping("/delete/{healthId}")
//    public String deleteHealth(@PathVariable Long healthId) {
//        healthService.deleteHealth(healthId);
//        return "redirect:/healths";
//    }
}
