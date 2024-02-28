package com.jaybhensdadia.hrms.controller;

import com.jaybhensdadia.hrms.entity.Emergency;
import com.jaybhensdadia.hrms.service.EmergencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/emergencies")
public class EmergencyController {

    @Autowired
    private EmergencyService emergencyService;

//    @GetMapping
//    public String listEmergencies(Model model) {
//        List<Emergency> emergencies = emergencyService.getAllEmergencies();
//        model.addAttribute("emergencies", emergencies);
//        return "emergency/list";
//    }

    @GetMapping("/emergency-form")
    public String showEmergencyForm(Model model) {
        model.addAttribute("form", "emergency");
        model.addAttribute("emergency", new Emergency());
        return "home";
    }

    @PostMapping("/addEmergency")
    public String saveEmergency(@ModelAttribute("emergency") Emergency emergency) {
        emergencyService.saveEmergency(emergency);
        return "redirect:/nominees/nominee-form";
    }

    @GetMapping("/edit/{emergencyId}")
    public String showEditForm(@PathVariable Long emergencyId, Model model) {
        Emergency emergency = emergencyService.getEmergencyById(emergencyId);
        model.addAttribute("emergency", emergency);
        return "emergency/form";
    }

    @PostMapping("/edit/{emergencyId}")
    public String updateEmergency(@PathVariable Long emergencyId, @ModelAttribute("emergency") Emergency emergency) {
        emergency.setEmergencyId(emergencyId);
        emergencyService.saveEmergency(emergency);
        return "redirect:/emergencies";
    }

//    @GetMapping("/delete/{emergencyId}")
//    public String deleteEmergency(@PathVariable Long emergencyId) {
//        emergencyService.deleteEmergency(emergencyId);
//        return "redirect:/emergencies";
//    }
}
