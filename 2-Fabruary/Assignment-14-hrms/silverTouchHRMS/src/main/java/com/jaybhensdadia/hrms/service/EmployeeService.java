package com.jaybhensdadia.hrms.service;


import com.jaybhensdadia.hrms.entity.Employee;

import java.util.List;

public interface EmployeeService {
    void saveEmployee(Employee employee);

    Employee fetchById(Long empId);

    void deleteById(Long empId);

    List<Employee> getAllEmployees();
}
