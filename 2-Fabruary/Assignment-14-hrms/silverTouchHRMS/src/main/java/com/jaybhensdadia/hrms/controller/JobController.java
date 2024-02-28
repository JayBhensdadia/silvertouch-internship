package com.jaybhensdadia.hrms.controller;

import com.jaybhensdadia.hrms.entity.Job;
import com.jaybhensdadia.hrms.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/jobs")
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping
    public String listJobs(Model model) {
        List<Job> jobList = jobService.fetchAllJobs();
        model.addAttribute("jobList", jobList);
        return "employment/job/list";
    }

    @GetMapping("/job-form")
    public String showJobForm(Model model) {
        model.addAttribute("form", "job");
        model.addAttribute("job", new Job());
        return "home";
    }

    @PostMapping("/addJob")
    public String saveJob(@ModelAttribute("job") Job job) {
        jobService.saveJob(job);
        return "redirect:/reportingOfficers/report-form";
    }

    @GetMapping("/edit/{jobId}")
    public String showEditForm(@PathVariable long jobId, Model model) {
        Job job = jobService.fetchById(jobId);
        model.addAttribute("job", job);
        return "employment/job/form";
    }

    @PostMapping("/edit/{jobId}")
    public String updateJob(@PathVariable long jobId, @ModelAttribute("job") Job job) {
        job.setJobId(jobId);
        jobService.saveJob(job);
        return "redirect:/jobs";
    }

    @GetMapping("/delete/{jobId}")
    public String deleteJob(@PathVariable long jobId) {
        jobService.deleteJob(jobId);
        return "redirect:/jobs";
    }
}

