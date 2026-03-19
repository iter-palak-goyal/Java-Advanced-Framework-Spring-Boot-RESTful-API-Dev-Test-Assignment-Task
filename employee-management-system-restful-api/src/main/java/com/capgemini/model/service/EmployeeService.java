package com.capgemini.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.model.entity.Employee;
import com.capgemini.model.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;
	
	public void saveEmployee(Employee employee) {
		employeeRepository.save(employee);
		System.out.println("Employee Saved Successfully!");
	}
	
	public void saveEmployees(List<Employee> employees) {
		employeeRepository.saveAll(employees);
		System.out.println("Employees Saved Successfully!");
	}
	
	public Employee getEmployee(Integer id) {
		// by id or all objects
		return employeeRepository.findById(id).get();
	}
	
	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}
}
