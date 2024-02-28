package com.jaybhensdadia.hrms.controller;

import com.jaybhensdadia.hrms.entity.Photographs;
import com.jaybhensdadia.hrms.service.PhotographsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/photographs")
public class PhotographsController {

    @Autowired
    private PhotographsService photographsService;

//    @GetMapping
//    public String listPhotographs(Model model) {
//        List<Photographs> photographsList = photographsService.getAllPhotographs();
//        model.addAttribute("photographsList", photographsList);
//        return "photographs/list";
//    }

    @GetMapping("/photo-form")
    public String showPhotographsForm(Model model) {
        model.addAttribute("form", "photo");
        model.addAttribute("photographs", new Photographs());
        return "form";
    }

    @PostMapping("/addPhoto")
    public String savePhotographs(@ModelAttribute("photographs") Photographs photographs) {
        photographsService.savePhotograph(photographs);
        return "redirect:/attachments/attach-form";
    }

    @GetMapping("/edit/{photographId}")
    public String showEditForm(@PathVariable Long photographId, Model model) {
        Photographs photographs = photographsService.getPhotographsById(photographId);
        model.addAttribute("photographs", photographs);
        return "photographs/form";
    }

    @PostMapping("/edit/{photographId}")
    public String updatePhotographs(@PathVariable Long photographId, @ModelAttribute("photographs") Photographs photographs) {
        photographs.setPhotographId(photographId);
        photographsService.savePhotograph(photographs);
        return "redirect:/photographs";
    }

//    @GetMapping("/delete/{photographId}")
//    public String deletePhotographs(@PathVariable Long photographId) {
//        photographsService.deletePhotographs(photographId);
//        return "redirect:/photographs";
//    }
}
