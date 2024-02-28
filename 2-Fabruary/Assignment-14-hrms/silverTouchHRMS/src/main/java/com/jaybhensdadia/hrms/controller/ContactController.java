package com.jaybhensdadia.hrms.controller;

import com.jaybhensdadia.hrms.entity.Contact;
import com.jaybhensdadia.hrms.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/contacts")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping
    public String listContacts(Model model) {
        List<Contact> contacts = contactService.getAllContacts();
        model.addAttribute("contacts", contacts);
        return "contact/list";
    }

    @GetMapping("/contact-form")
    public String showContactForm(Model model) {
        model.addAttribute("form", "contact");
        model.addAttribute("contact", new Contact());
        return "home";
    }

    @PostMapping("/addContact")
    public String saveContact(@ModelAttribute("contact") Contact contact) {
        contactService.saveContactService(contact);
        return "redirect:/families/family-form";
    }

    @GetMapping("/edit/{contactId}")
    public String showEditForm(@PathVariable Long contactId, Model model) {
        Contact contact = contactService.getContact(contactId);
        model.addAttribute("contact", contact);
        return "contact/form";
    }

    @PostMapping("/edit/{contactId}")
    public String updateContact(@PathVariable Long contactId, @ModelAttribute("contact") Contact contact) {
        contact.setContactId(contactId);
        contactService.saveContactService(contact);
        return "redirect:/contacts";
    }

//    @GetMapping("/delete/{contactId}")
//    public String deleteContact(@PathVariable Long contactId) {
//        contactService.deleteContact(contactId);
//        return "redirect:/contacts";
//    }
}
