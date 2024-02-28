package com.jaybhensdadia.hrms.controller;

import com.jaybhensdadia.hrms.entity.Bank;
import com.jaybhensdadia.hrms.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/banks")
public class BankController {

    @Autowired
    private BankService bankService;

    @GetMapping
    public String listBanks(Model model) {
        List<Bank> banks = bankService.getAllBank();
        model.addAttribute("banks", banks);
        return "bank/list";
    }

    @GetMapping("/new")
    public String showBankForm(Model model) {
        model.addAttribute("bank", new Bank());
        return "bank/form";
    }

    @PostMapping("/new")
    public String saveBank(@ModelAttribute("bank") Bank bank) {
        bankService.saveBank(bank);
        return "redirect:/banks";
    }

    @GetMapping("/edit/{bankId}")
    public String showEditForm(@PathVariable Long bankId, Model model) {
        Bank bank = bankService.fetchBankById(bankId);
        model.addAttribute("bank", bank);
        return "bank/form";
    }

    @PostMapping("/edit/{bankId}")
    public String updateBank(@PathVariable Long bankId, @ModelAttribute("bank") Bank bank) {
        bank.setBankId(bankId);
        bankService.saveBank(bank);
        return "redirect:/banks";
    }

//    @GetMapping("/delete/{bankId}")
//    public String deleteBank(@PathVariable Long bankId) {
//        bankService.deleteBank(bankId);
//        return "redirect:/banks";
//    }
}

