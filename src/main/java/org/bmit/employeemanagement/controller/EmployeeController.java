package org.bmit.employeemanagement.controller;

import java.util.List;
import org.bmit.employeemanagement.model.Employee;
import org.bmit.employeemanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeerepository  ;
	
	//get all  employee
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return employeerepository.findAll();
		
	}
}
