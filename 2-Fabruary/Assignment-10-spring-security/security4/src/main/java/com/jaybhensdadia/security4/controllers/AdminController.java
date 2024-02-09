package com.jaybhensdadia.security4.controllers;

import com.jaybhensdadia.security4.entities.Admin;
import com.jaybhensdadia.security4.entities.Employee;
import com.jaybhensdadia.security4.error.AdminDoesNotExist;
import com.jaybhensdadia.security4.error.EmployeeDoesNotExist;
import com.jaybhensdadia.security4.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminController {

    @Autowired
    AdminService adminService;

    @PostMapping("/admin/add")
    public Admin addAdmin(@RequestBody Admin admin){
        return adminService.addAdmin(admin);
    }

    @GetMapping("/admin")
    public List<Admin> getAdmins(){
        return adminService.getAdmins();
    }

    @GetMapping("/admin/{id}")
    public Admin getAdminById(@PathVariable("id") Long adminId) throws AdminDoesNotExist {
        return adminService.getAdminById(adminId);
    }

    @DeleteMapping("/admin/{id}")
    public String deleteAdmin(@PathVariable("id") Long adminId) throws AdminDoesNotExist{
        adminService.deleteAdminById(adminId);
        return "Admin deleted Successfully!!";
    }


    @PutMapping("/admin/{id}")
    public Admin updateAdminById(@PathVariable("id") Long adminId, @RequestBody Admin admin) throws AdminDoesNotExist{
        return adminService.updateAdminById(adminId,admin);
    }
}
