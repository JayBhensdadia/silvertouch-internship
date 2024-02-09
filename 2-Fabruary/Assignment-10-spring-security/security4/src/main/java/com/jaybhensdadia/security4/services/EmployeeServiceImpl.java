package com.jaybhensdadia.security4.services;

import com.jaybhensdadia.security4.entities.Employee;
import com.jaybhensdadia.security4.error.EmployeeDoesNotExist;
import com.jaybhensdadia.security4.repositories.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepo employeeRepo;


    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }


    @Override
    public List<Employee> getEmployees() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee getEmployeeById(Long empId) throws EmployeeDoesNotExist {
        Optional<Employee> emp =  employeeRepo.findById(empId);
        if(!emp.isPresent()){throw new EmployeeDoesNotExist("Employee Does not Exist!!!");}
        return emp.get();
    }

    @Override
    public void deleteEmployeeById(Long empId) throws EmployeeDoesNotExist {
        employeeRepo.deleteById(empId);
    }

    @Override
    public Employee updateEmployeeById(Long empId, Employee employee) throws EmployeeDoesNotExist {
        Optional<Employee> oldEmp = employeeRepo.findById(empId);
        if (!oldEmp.isPresent()){throw new EmployeeDoesNotExist("Employee does not exist!!");}
        Employee temp = oldEmp.get();
        temp.setEmpName(employee.getEmpName());
        temp.setEmpRole(employee.getEmpRole());
        temp.setEmpEmail(employee.getEmpEmail());
        temp.setEmpPassword(employee.getEmpPassword());
        temp.setEmpPhoneNumber(employee.getEmpPhoneNumber());
        temp.setEmpAddress(employee.getEmpAddress());
        temp.setEmpEducation(employee.getEmpEducation());
        temp.setEmpCompany(employee.getEmpCompany());
        temp.setEmpBio(employee.getEmpBio());
        return employeeRepo.save(temp);
    }
}


