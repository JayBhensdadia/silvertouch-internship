package com.jaybhensdadia.securitydb.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

    @Id
    private int id;
    private String name;
    private String department;
    private String role;

    private String email;
    private String password;

    public Employee() {
    }

    public Employee(int id, String name, String department, String role, String email, String password) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.role = role;
        this.email = email;
        this.password = password;
    }

    public Employee(String name, String department, String role, String email, String password) {
        this.name = name;
        this.department = department;
        this.role = role;
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}