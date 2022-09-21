package com.smart.service;

import java.util.List;

import com.smart.entity.Employee;

public interface EmployeeService {
    
	public List<Employee> getAllEmployee();
	
	public void saveEmployee(Employee employee);
	
	public Employee getEmployeeById(Integer id);
	
	public void deleteEmployeeById(Integer id);
	
}
