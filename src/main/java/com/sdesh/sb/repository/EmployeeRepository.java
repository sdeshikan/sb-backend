package com.sdesh.sb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sdesh.sb.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}
