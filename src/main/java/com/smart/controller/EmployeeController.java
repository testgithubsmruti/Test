package com.smart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smart.entity.Employee;
import com.smart.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
     
	@Autowired
	private EmployeeService service;
	@GetMapping("/all")
	public ResponseEntity<List<Employee>> showAllEmployee(){
		List<Employee> employee = service.getAllEmployee();
		return new ResponseEntity<>(employee, HttpStatus.OK);
	}
	@PostMapping("/add")
	public ResponseEntity addEmployee(@RequestBody Employee employee){
		service.saveEmployee(employee);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	@GetMapping("/find/{id}")
	public ResponseEntity<Employee> showOneEmployee(@PathVariable("id") Integer id){
		Employee employee = service.getEmployeeById(id);
		return new ResponseEntity(employee, HttpStatus.OK);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteEmployee(@PathVariable("id") Integer id){
		service.deleteEmployeeById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	
}
