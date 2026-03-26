package com.jenkins.springboot_jenkins.controller;

import com.jenkins.springboot_jenkins.model.Employee;
import com.jenkins.springboot_jenkins.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public String getData() {
        return "Jenkins Working Fine ";
    }


    @PostMapping
    public ResponseEntity<Employee>createEmployee(@RequestBody Employee employee){
       Employee savedEmployees = employeeService.createEmployee(employee);
       return ResponseEntity.status(HttpStatus.CREATED)
               .body(savedEmployees);
    }



}
