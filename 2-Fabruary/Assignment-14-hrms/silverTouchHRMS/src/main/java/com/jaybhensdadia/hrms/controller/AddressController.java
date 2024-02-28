package com.jaybhensdadia.hrms.controller;

import com.jaybhensdadia.hrms.entity.Address;
import com.jaybhensdadia.hrms.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/addresses")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping
    public String listAddresses(Model model) {
        List<Address> addresses = addressService.fetchAllAddresses();
        model.addAttribute("addresses", addresses);
        return "address/list";
    }

    @GetMapping("/add-addr")
    public String showAddressForm(Model model) {
        model.addAttribute("address", new Address());
        return "redirect:/contacts/contact-form";
    }

    @PostMapping("/new")
    public String saveAddress(@ModelAttribute("address") Address address) {
        addressService.saveAddress(address);
        return "redirect:/addresses";
    }

    @GetMapping("/edit/{addressId}")
    public String showEditForm(@PathVariable Long addressId, Model model) {
        Address address = addressService.fetchById(addressId);
        model.addAttribute("address", address);
        return "address/form";
    }

    @PostMapping("/edit/{addressId}")
    public String updateAddress(@PathVariable Long addressId, @ModelAttribute("address") Address address) {
        address.setAddressId(addressId);
        addressService.saveAddress(address);
        return "redirect:/addresses";
    }

//    @GetMapping("/delete/{addressId}")
//    public String deleteAddress(@PathVariable Long addressId) {
//        addressService.deleteAddressByEmpId(addressId);
//        return "redirect:/addresses";
//    }
}

