package com.jenkins.springboot_jenkins.service;

import com.jenkins.springboot_jenkins.model.Employee;
import com.jenkins.springboot_jenkins.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    public Employee createEmployee(Employee employee) {
       return employeeRepository.save(employee);
    }
}
