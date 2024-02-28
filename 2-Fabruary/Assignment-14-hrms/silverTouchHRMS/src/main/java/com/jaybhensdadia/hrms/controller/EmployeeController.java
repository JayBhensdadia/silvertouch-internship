package com.jaybhensdadia.hrms.controller;

import com.jaybhensdadia.hrms.entity.Designation;
import com.jaybhensdadia.hrms.entity.Employee;
import com.jaybhensdadia.hrms.service.DesignationService;
import com.jaybhensdadia.hrms.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private DesignationService designationService;

    @GetMapping
    public String listEmployees(Model model) {
        List<Employee> employees = employeeService.getAllEmployees();
        model.addAttribute("employees", employees);
        return "employee/list";
    }

    @GetMapping("/employee-form")
    public String showEmployeeForm(Model model) {
        model.addAttribute("form", "employee");
        model.addAttribute("employee", new Employee());
        List<Designation> designationList = designationService.fetchAll();
        for(Designation designation: designationList){
            System.out.println(designation.getDesignationName());
        }
        model.addAttribute("designations", designationList);
        return "home";
    }

    @PostMapping("/addEmployee")
    public String saveEmployeeInfo(@ModelAttribute Employee employee, @RequestParam("dateOfAppointment") String dateOfAppointment, @RequestParam("empDesignation") Long designationId) throws ParseException, ParseException {
        System.out.println("saveEmployeeInfo() called");


        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        employee.setEmployeeDateOfAppointment(String.valueOf(dateFormat.parse(dateOfAppointment)));

        System.out.println(employee.toString());


        Designation designation = designationService.fetchById(designationId);
        employee.setEmployeeDesignation(designation);

        employeeService.saveEmployee(employee);
        return "redirect:/personalDetails/personal-form";
    }

//    @PostMapping("/new")
//    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
//        System.out.println(employee.toString());
//        employeeService.saveEmployee(employee);
//        return "redirect:/login";
//    }

    @GetMapping("/edit/{employeeId}")
    public String showEditForm(@PathVariable Long employeeId, Model model) {
        Employee employee = employeeService.fetchById(employeeId);
        model.addAttribute("employee", employee);
        return "employee/form";
    }

    @PostMapping("/edit/{employeeId}")
    public String updateEmployee(@PathVariable Long employeeId, @ModelAttribute("employee") Employee employee) {
        employee.setEmployeeId(employeeId);
        employeeService.saveEmployee(employee);
        return "redirect:/employees";
    }

//    @GetMapping("/delete/{employeeId}")
//    public String deleteEmployee(@PathVariable Long employeeId) {
//        employeeService.deleteEmployee(employeeId);
//        return "redirect:/employees";
//    }
}
