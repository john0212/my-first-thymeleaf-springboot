package com.john.thymeleafdemo.service;

import com.john.thymeleafdemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int id);

    void save(Employee theEmployee);

    void deleteById(int id);
}
