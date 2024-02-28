package com.jaybhensdadia.hrms.controller;

import com.jaybhensdadia.hrms.entity.ReportingOfficer;
import com.jaybhensdadia.hrms.service.ReportingOfficerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/reportingOfficers")
public class ReportingOfficerController {

    @Autowired
    private ReportingOfficerService reportingOfficerService;

    @GetMapping
    public String listReportingOfficers(Model model) {
        List<ReportingOfficer> reportingOfficerList = reportingOfficerService.fetchAllReportingOfficer();
        model.addAttribute("reportingOfficerList", reportingOfficerList);
        return "employment/reportingOfficer/list";
    }

    @GetMapping("/report-form")
    public String showReportingOfficerForm(Model model) {
        model.addAttribute("form", "reportingOfficer");
        model.addAttribute("reportingOfficer", new ReportingOfficer());
        return "home";
    }

    @PostMapping("/addReporting")
    public String saveReportingOfficer(@ModelAttribute("reportingOfficer") ReportingOfficer reportingOfficer) {
        reportingOfficerService.saveReportingOfficer(reportingOfficer);
        return "redirect:/previousEmployments/prev-emp";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable long id, Model model) {
        ReportingOfficer reportingOfficer = reportingOfficerService.fetchById(id);
        model.addAttribute("reportingOfficer", reportingOfficer);
        return "employment/reportingOfficer/form";
    }

    @PostMapping("/edit/{id}")
    public String updateReportingOfficer(@PathVariable long id, @ModelAttribute("reportingOfficer") ReportingOfficer reportingOfficer) {
        reportingOfficer.setId(id);
        reportingOfficerService.saveReportingOfficer(reportingOfficer);
        return "redirect:/reportingOfficers";
    }

    @GetMapping("/delete/{id}")
    public String deleteReportingOfficer(@PathVariable long id) {
        reportingOfficerService.deleteReportingOfficer(id);
        return "redirect:/reportingOfficers";
    }
}
