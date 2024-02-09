package com.jaybhensdadia.security4.services;

import com.jaybhensdadia.security4.entities.Employee;
import com.jaybhensdadia.security4.error.EmployeeDoesNotExist;

import java.util.List;

public interface EmployeeService {
    public Employee addEmployee(Employee employee);

    public List<Employee> getEmployees();

    public Employee getEmployeeById(Long empId) throws EmployeeDoesNotExist;

    public void deleteEmployeeById(Long empId) throws EmployeeDoesNotExist;

    public Employee updateEmployeeById(Long empId, Employee employee) throws EmployeeDoesNotExist;

    public Employee findEmployeeByEmail(String email) throws EmployeeDoesNotExist;
}
