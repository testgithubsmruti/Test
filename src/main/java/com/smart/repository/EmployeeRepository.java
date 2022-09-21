package com.smart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smart.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
