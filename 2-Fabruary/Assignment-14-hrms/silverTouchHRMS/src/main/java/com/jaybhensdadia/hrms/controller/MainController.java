package com.jaybhensdadia.hrms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(){
        return "login";
    }

    @GetMapping("/employee/employeeList")
    public String dashboard(Model model){
        model.addAttribute("form", "dashboard");
        return "home";
    }

    @PostMapping("/login")
    public String login(Model model){
        model.addAttribute("form", "dashboard");
        return "home";
    }

//    Employment Information
    @GetMapping("/employee-form")
    public String employeeForm(Model model){
        model.addAttribute("form", "employee");
        return "home";
    }
    @GetMapping("/personal-form")
    public String personalForm(Model model){
        model.addAttribute("form", "personal");
        return "home";
    }
    @GetMapping("/contact-form")
    public String contactForm(Model model){
        model.addAttribute("form", "contact");
        return "home";
    }
    @GetMapping("/family-form")
    public String familyForm(Model model){
        model.addAttribute("form", "family");
        return "home";
    }
    @GetMapping("/emergency-form")
    public String emergencyForm(Model model){
        model.addAttribute("form", "emergency");
        return "home";
    }
    @GetMapping("/nominee-form")
    public String nomineeForm(Model model){
        model.addAttribute("form", "nominee");
        return "home";
    }
    @GetMapping("/health-form")
    public String healthForm(Model model){
        model.addAttribute("form", "health");
        return "home";
    }
    @GetMapping("/photo-form")
    public String photoForm(Model model){
        model.addAttribute("form", "photo");
        return "home";
    }
    @GetMapping("/attach-form")
    public String attachForm(Model model){
        model.addAttribute("form", "attach");
        return "home";
    }

//    Employment
    @GetMapping("/allowance-form")
    public String allowanceForm(Model model){
        model.addAttribute("form", "allowanceDeclaration");
        return "home";
    }
    @GetMapping("/job-form")
    public String jobForm(Model model){
        model.addAttribute("form", "job");
        return "home";
    }
    @GetMapping("/reportingOfficer-form")
    public String reportingOfficerForm(Model model){
        model.addAttribute("form", "reportingOfficer");
        return "home";
    }
    @GetMapping("/salary-form")
    public String salaryForm(Model model){
        model.addAttribute("form", "salary");
        return "home";
    }
    @GetMapping("/previousEmployment-form")
    public String previousEmploymentForm(Model model){
        model.addAttribute("form", "previousEmployment");
        return "home";
    }

    @GetMapping("/show-qualiForm")
    public String qualiForm(Model model){
        model.addAttribute("form", "quali");
        return "home";
    }

    @GetMapping("/test-form")
    public String testForm(Model model){
        model.addAttribute("form", "test");
        return "home";
    }
}
