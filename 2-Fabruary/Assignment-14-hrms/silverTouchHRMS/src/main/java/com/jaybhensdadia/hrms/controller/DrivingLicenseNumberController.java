package com.jaybhensdadia.hrms.controller;

import com.jaybhensdadia.hrms.entity.DrivingLicenseNumber;
import com.jaybhensdadia.hrms.service.DrivingLicenseNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/driving-licenses")
public class DrivingLicenseNumberController {

    @Autowired
    private DrivingLicenseNumberService drivingLicenseNumberService;

//    @GetMapping
//    public String listDrivingLicenses(Model model) {
//        List<DrivingLicenseNumber> drivingLicenses = drivingLicenseNumberService.();
//        model.addAttribute("drivingLicenses", drivingLicenses);
//        return "drivingLicense/list";
//    }

    @GetMapping("/new")
    public String showDrivingLicenseForm(Model model) {
        model.addAttribute("drivingLicense", new DrivingLicenseNumber());
        return "drivingLicense/form";
    }

    @PostMapping("/new")
    public String saveDrivingLicense(@ModelAttribute("drivingLicense") DrivingLicenseNumber drivingLicense) {
        drivingLicenseNumberService.saveDrivingLicenseNumber(drivingLicense);
        return "redirect:/driving-licenses";
    }

    @GetMapping("/edit/{licenseNumber}")
    public String showEditForm(@PathVariable Long licenseNumber, Model model) {
        DrivingLicenseNumber drivingLicense = drivingLicenseNumberService.getById(licenseNumber);
        model.addAttribute("drivingLicense", drivingLicense);
        return "drivingLicense/form";
    }

    @PostMapping("/edit/{licenseNumber}")
    public String updateDrivingLicense(@PathVariable Long licenseNumber, @ModelAttribute("drivingLicense") DrivingLicenseNumber drivingLicense) {
        drivingLicense.setLicenseNumber(licenseNumber);
        drivingLicenseNumberService.saveDrivingLicenseNumber(drivingLicense);
        return "redirect:/driving-licenses";
    }

//    @GetMapping("/delete/{licenseNumber}")
//    public String deleteDrivingLicense(@PathVariable Long licenseNumber) {
//        drivingLicenseNumberService.deleteDrivingLicense(licenseNumber);
//        return "redirect:/driving-licenses";
//    }
}
