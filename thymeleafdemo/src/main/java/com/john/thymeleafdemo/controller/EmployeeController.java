package com.john.thymeleafdemo.controller;

import com.john.thymeleafdemo.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    // load employee data
    private List<Employee> theEmployees;

    @PostConstruct
    public void loadData() {

        // create employees
        Employee emp1 = new Employee(1,"John","Chen","john@gmail.com");
        Employee emp2 = new Employee(2,"Mary","Lin","mary@gmail.com");
        Employee emp3 = new Employee(3,"Jack","Wu","jack@gmail.com");

        // create the list
        theEmployees = new ArrayList<>();

        // add to the list
        theEmployees.add(emp1);
        theEmployees.add(emp2);
        theEmployees.add(emp3);

    }

    // add mapping for "list"

}
