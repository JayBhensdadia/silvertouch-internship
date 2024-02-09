package com.jaybhensdadia.security4.services;

import com.jaybhensdadia.security4.entities.Admin;
import com.jaybhensdadia.security4.entities.Employee;
import com.jaybhensdadia.security4.error.AdminDoesNotExist;
import com.jaybhensdadia.security4.repositories.AdminRepo;
import com.jaybhensdadia.security4.repositories.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminServiceImpl implements AdminService{

    @Autowired
    private AdminRepo adminRepo;


    @Override
    public Admin addAdmin(Admin admin) {
        return adminRepo.save(admin);
    }


    @Override
    public List<Admin> getAdmins() {
        return adminRepo.findAll();
    }


    @Override
    public Admin getAdminById(Long adminId) throws AdminDoesNotExist{
        Optional<Admin> admin = adminRepo.findById(adminId);
        if (!admin.isPresent()){throw new AdminDoesNotExist("Admin does not exist!!");}
        return admin.get();
    }


    @Override
    public void deleteAdminById(Long adminId) throws AdminDoesNotExist {
        adminRepo.deleteById(adminId);
    }


    @Override
    public Admin updateAdminById(Long adminId, Admin admin) throws AdminDoesNotExist {
        Optional<Admin> oldAdmin = adminRepo.findById(adminId);
        if (!oldAdmin.isPresent()){ throw new AdminDoesNotExist("Admin does not exist!");}
        Admin temp = oldAdmin.get();
        temp.setAdminName(admin.getAdminName());
        temp.setAdminRole(admin.getAdminRole());
        temp.setAdminPassword(admin.getAdminPassword());
        temp.setAdminEmail(admin.getAdminEmail());
        temp.setAdminPhoneNumber(admin.getAdminPhoneNumber());
        temp.setAdminAddress(admin.getAdminAddress());
        return adminRepo.save(temp);
    }
}

