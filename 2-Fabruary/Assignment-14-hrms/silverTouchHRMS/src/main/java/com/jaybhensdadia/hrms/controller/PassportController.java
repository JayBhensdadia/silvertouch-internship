package com.jaybhensdadia.hrms.controller;

import com.jaybhensdadia.hrms.entity.Passport;
import com.jaybhensdadia.hrms.service.PassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/passports")
public class PassportController {

    @Autowired
    private PassportService passportService;

//    @GetMapping
//    public String listPassports(Model model) {
//        List<Passport> passports = passportService.getAllPassports();
//        model.addAttribute("passports", passports);
//        return "passport/list";
//    }

    @GetMapping("/new")
    public String showPassportForm(Model model) {
        model.addAttribute("passport", new Passport());
        return "passport/form";
    }

    @PostMapping("/new")
    public String savePassport(@ModelAttribute("passport") Passport passport) {
        passportService.savePassport(passport);
        return "redirect:/passports";
    }

    @GetMapping("/edit/{passportId}")
    public String showEditForm(@PathVariable Long passportId, Model model) {
        Passport passport = passportService.getPassportById(passportId);
        model.addAttribute("passport", passport);
        return "passport/form";
    }

    @PostMapping("/edit/{passportId}")
    public String updatePassport(@PathVariable Long passportId, @ModelAttribute("passport") Passport passport) {
        passport.setPassportId(passportId);
        passportService.savePassport(passport);
        return "redirect:/passports";
    }

//    @GetMapping("/delete/{passportId}")
//    public String deletePassport(@PathVariable Long passportId) {
//        passportService.deletePassport(passportId);
//        return "redirect:/passports";
//    }
}
