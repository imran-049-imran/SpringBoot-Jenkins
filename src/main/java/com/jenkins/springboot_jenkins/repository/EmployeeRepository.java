package com.jenkins.springboot_jenkins.repository;

import com.jenkins.springboot_jenkins.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {



}
