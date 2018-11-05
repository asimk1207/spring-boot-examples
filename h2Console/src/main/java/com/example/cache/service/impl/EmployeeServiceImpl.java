package com.example.cache.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cache.domain.Employee;
import com.example.cache.repository.EmployeeRepository;
import com.example.cache.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
    private EmployeeRepository employeeRepository;
    
	@Override
	public Employee findById(Long empId) {
		Employee employee = employeeRepository.getOne(empId);
		return employee;
	}

	@Override
	public Employee findByName(String empName) {
		Employee employee = employeeRepository.findByName(empName);
		return employee;
	}

}
