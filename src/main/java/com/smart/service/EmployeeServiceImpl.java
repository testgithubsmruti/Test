package com.smart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smart.entity.Employee;
import com.smart.exception.EmployeeNotFoundException;
import com.smart.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public List<Employee> getAllEmployee() {
		
		return repo.findAll();
	}
	
	@Override
	public void saveEmployee(Employee employee) {
		this.repo.save(employee);
	}
	@Override
	public Employee getEmployeeById(Integer id) {
		Optional<Employee> optional = repo.findById(id);
		Employee employee=null;
		if(optional.isPresent()) {
			employee=optional.get();
		}else {
			throw new EmployeeNotFoundException("Employee '"+id+"' is not available");
		}
		return employee;
		
	}
	@Override
	public void deleteEmployeeById(Integer id) {
       this.repo.deleteById(id);		
	}

}
