package com.jaybhensdadia.foodorder.controller;

import java.io.IOException;
import java.security.Principal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jaybhensdadia.foodorder.entities.Complaint;
import com.jaybhensdadia.foodorder.entities.Offer;
import com.jaybhensdadia.foodorder.entities.User;
import com.jaybhensdadia.foodorder.generator.PdfGenerator;
import com.jaybhensdadia.foodorder.repositories.UserRepo;
import com.jaybhensdadia.foodorder.services.ComplaintService;

import jakarta.servlet.http.HttpServletResponse;


@Controller
@RequestMapping("/complaint")
public class ComplaintController {
    

    @Autowired
    ComplaintService complaintService;

    @Autowired
    UserRepo userRepo;

    @GetMapping("/manage-complaints")
    public String manageComplaints(Model model) {
        
        // model.addAttribute("role", "ADMIN");
        // // model.addAttribute("role", "RESTAURANT");
        // model.addAttribute("page", "manage-complaints");
        // model.addAttribute("complaints", complaintService.getAllComplaints() );
        return "redirect:/complaint/page/1";
    }

    @GetMapping("/add-complaint")
    public String addArea(Model model) {
        model.addAttribute("page", "add-complaint");
        return "home";
    }

    @PostMapping("/add-complaint-to-db")
    public String addAreaToDb(@ModelAttribute Complaint complaint){
        complaintService.addComplaint(complaint);
        return "redirect:/complaint/manage-complaints";
    }
    

    @GetMapping("/delete-complaint/{id}")    
    public String deleteCity(@PathVariable String id) {
        complaintService.deleteComplaintById(Long.parseLong(id));
        return "redirect:/complaint/manage-complaints";
    }


    @GetMapping("/edit-complaint/{id}")
    public String editCity(Model model, @PathVariable String id) throws Exception {
        
        Complaint complaint = complaintService.getComplaintById(Long.parseLong(id));
        model.addAttribute("complaint", complaint);
        model.addAttribute("page", "edit-complaint");
        return "home";
    }

    @PostMapping("/update-complaint/{id}")
    public String updateCity(@PathVariable String id, @ModelAttribute Complaint complaint) throws Exception{
        
        Complaint oldComplaint = complaintService.getComplaintById(Long.parseLong(id));
       
        oldComplaint.setRestaurantId(complaint.getRestaurantId());
        oldComplaint.setUserName(complaint.getUserName());
        oldComplaint.setSubject(complaint.getSubject());
        oldComplaint.setDescription(complaint.getDescription());
        oldComplaint.setComplaintDate(complaint.getComplaintDate());
        oldComplaint.setReplyDate(complaint.getReplyDate());
        oldComplaint.setReply(complaint.getReply());
        oldComplaint.setStatus(complaint.getStatus());
       
        complaintService.saveToDb(oldComplaint);

        return "redirect:/complaint/manage-complaints";
    }


    @GetMapping("/pdf")
    public void generatePDf(HttpServletResponse response) throws IOException {
        response.setContentType("application/pdf");
        DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD:HH:MM:SS");
        String currentDateTime = dateFormat.format(new Date());
        String headerkey = "Content-Disposition";
        String headervalue = "attachment; filename=complaint" + currentDateTime + ".pdf";
        response.setHeader(headerkey, headervalue);
        PdfGenerator generator = new PdfGenerator();
        generator.generatePdfForComplaints(complaintService.getAllComplaints(), response);
    }


    @GetMapping("/page/{page}")
    public String mangeComplaintsPaged(Model model, @PathVariable("page") int page, Principal principal){

        int currentPage = page;
        int pageSize = 5;
        Page<Complaint> complaintPage = complaintService.getPaginatedComplaints(PageRequest.of(currentPage-1,pageSize));
        int totalPages = complaintPage.getTotalPages();
        if (totalPages > 0) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages)
                    .boxed()
                    .collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }
        model.addAttribute("currentPage", currentPage);
        model.addAttribute("totalPages", totalPages);
        model.addAttribute("totalItems", complaintPage.getTotalElements());
        model.addAttribute("complaints",complaintPage.getContent());
        // model.addAttribute("role", "ADMIN");
        // model.addAttribute("role", "RESTAURANT");
        model.addAttribute("page", "manage-complaints");


        String username = principal.getName();

        //get user of username from db
        Optional<User> user = userRepo.findByEmail(username);

        model.addAttribute("role", user.get().getRole());

        return "home";
    }

}
