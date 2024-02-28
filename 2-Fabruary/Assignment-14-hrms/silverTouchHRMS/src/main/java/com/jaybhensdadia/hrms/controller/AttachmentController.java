package com.jaybhensdadia.hrms.controller;

import com.jaybhensdadia.hrms.entity.Attachment;
import com.jaybhensdadia.hrms.entity.DocumentCategory;
import com.jaybhensdadia.hrms.service.AttachmentService;
import com.jaybhensdadia.hrms.service.DocumentCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/attachments")
public class AttachmentController {

    @Autowired
    private AttachmentService attachmentService;

    @Autowired
    private DocumentCategoryService documentCategoryService;

    @GetMapping
    public String listAttachments(Model model) {
        List<Attachment> attachments = attachmentService.fetchAllAttachments();
        model.addAttribute("attachments", attachments);
        return "attachment/list";
    }

    @GetMapping("/attach-form")
    public String showAttachmentForm(Model model) {
        List<DocumentCategory> documentCategories = documentCategoryService.fetchAllDocumentCategories();
        model.addAttribute("documentCategories", documentCategories);
        model.addAttribute("form", "attach");
        model.addAttribute("attachment", new Attachment());
        return "home";
    }

    @PostMapping("/addAttach")
    public String saveAttachment(@ModelAttribute("attachment") Attachment attachment) {
        attachmentService.saveAttachment(attachment);
        return "redirect:/jobs/job-form";//left from here
    }

    @GetMapping("/edit/{attachmentId}")
    public String showEditForm(@PathVariable Long attachmentId, Model model) {
        Attachment attachment = attachmentService.fetchAttachmentById(attachmentId);
        List<DocumentCategory> documentCategories = documentCategoryService.fetchAllDocumentCategories();
        model.addAttribute("documentCategories", documentCategories);
        model.addAttribute("attachment", attachment);
        return "attachment/form";
    }

    @PostMapping("/edit/{attachmentId}")
    public String updateAttachment(@PathVariable Long attachmentId, @ModelAttribute("attachment") Attachment attachment) {
        attachment.setAttachmentId(attachmentId);
        attachmentService.saveAttachment(attachment);
        return "redirect:/attachments";
    }

//    @GetMapping("/delete/{attachmentId}")
//    public String deleteAttachment(@PathVariable Long attachmentId) {
//        attachmentService.deleteAttachment(attachmentId);
//        return "redirect:/attachments";
//    }

}

