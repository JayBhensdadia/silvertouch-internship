package com.jaybhensdadia.security4.controllers;

import com.jaybhensdadia.security4.entities.Employee;
import com.jaybhensdadia.security4.error.EmployeeDoesNotExist;
import com.jaybhensdadia.security4.services.AdminService;
import com.jaybhensdadia.security4.services.EmployeeService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {



    @Autowired
    EmployeeService employeeService;

    @PostMapping("/employee/add")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @GetMapping("/employee")
    public List<Employee> getEmployees(){
        return employeeService.getEmployees();
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable("id") Long empId) throws EmployeeDoesNotExist {
        return employeeService.getEmployeeById(empId);
    }


    @DeleteMapping("/employee/{id}")
    public String deleteEmployee(@PathVariable("id") Long empId) throws EmployeeDoesNotExist{
        employeeService.deleteEmployeeById(empId);
        return "Employee deleted Successfully!!";
    }

    @PutMapping("/employee/{id}")
    public Employee updateEmployeeById(@PathVariable("id") Long empId, @RequestBody Employee employee) throws EmployeeDoesNotExist{
        return employeeService.updateEmployeeById(empId,employee);
    }

//    @GetMapping("/mydetails")
//    public Employee getMyDetails(HttpServletRequest req) throws EmployeeDoesNotExist{
//        Long empId = (Long) req.getSession().getAttribute("empId");
//        return employeeService.getEmployeeById(empId);
//    }

}
