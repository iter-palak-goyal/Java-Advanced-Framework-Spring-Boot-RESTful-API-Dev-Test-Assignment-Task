package com.capgemini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.model.entity.Employee;
import com.capgemini.model.service.EmployeeService;

import jakarta.websocket.server.PathParam;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/saveEmployee")
	public void postEmployee(@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
	}
	@PostMapping("/saveEmployees")
	public void postEmployee(@RequestBody List<Employee> employees) {
		employeeService.saveEmployees(employees);
	}
	@GetMapping("/getEmployee/{id}")
	public Employee getEmployee(@PathVariable Integer id) {
		return employeeService.getEmployee(id);
	}
	
	@GetMapping("/getEmployees")
	public List<Employee> getEmployees() {
		return employeeService.getEmployees();
	}
}