package com.jaybhensdadia.hrms.service;

import com.jaybhensdadia.hrms.repository.EmployeeRepository;
import com.jaybhensdadia.hrms.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImplementation implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public Employee fetchById(Long empId) {
        return employeeRepository.findById(empId).get();
    }

    @Override
    public void deleteById(Long empId) {
        employeeRepository.deleteById(empId);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
