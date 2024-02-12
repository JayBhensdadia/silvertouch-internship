package com.jaybhensdadia.securitydb.repositories;

import com.jaybhensdadia.securitydb.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

    public Employee findByEmail(String email);

}
