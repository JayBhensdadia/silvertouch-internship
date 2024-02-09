package com.jaybhensdadia.security4.services;

import com.jaybhensdadia.security4.entities.Admin;
import com.jaybhensdadia.security4.entities.Employee;
import com.jaybhensdadia.security4.error.AdminDoesNotExist;

import java.util.List;

public interface AdminService {


    public Admin addAdmin(Admin admin);

    public List<Admin> getAdmins();

    public Admin getAdminById(Long adminId) throws AdminDoesNotExist;

    public void deleteAdminById(Long adminId) throws AdminDoesNotExist;

    public Admin updateAdminById(Long adminId, Admin admin) throws AdminDoesNotExist;
}
