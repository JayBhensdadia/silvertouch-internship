package com.jaybhensdadia.hrms.controller;

import com.jaybhensdadia.hrms.entity.Nominee;
import com.jaybhensdadia.hrms.service.NomineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/nominees")
public class NomineeController {

    @Autowired
    private NomineeService nomineeService;


    @GetMapping("/nominee-form")
    public String showNomineeForm(Model model) {
        model.addAttribute("form", "nominee");        model.addAttribute("nominee", new Nominee());
        return "home";
    }

    @PostMapping("/addNominee")
    public String saveNominee(@ModelAttribute("nominee") Nominee nominee) {
        nomineeService.saveNominee(nominee);
        return "redirect:/healths/health-form";
    }

    @GetMapping("/edit/{nomineeId}")
    public String showEditForm(@PathVariable Long nomineeId, Model model) {
        Nominee nominee = nomineeService.getNomineeById(nomineeId);
        model.addAttribute("nominee", nominee);
        return "nominee/form";
    }

    @PostMapping("/edit/{nomineeId}")
    public String updateNominee(@PathVariable Long nomineeId, @ModelAttribute("nominee") Nominee nominee) {
        nominee.setNomineeId(nomineeId);
        nomineeService.saveNominee(nominee);
        return "redirect:/nominees";
    }

//    @GetMapping("/delete/{nomineeId}")
//    public String deleteNominee(@PathVariable Long nomineeId) {
//        nomineeService.deleteNominee(nomineeId);
//        return "redirect:/nominees";
//    }
}
