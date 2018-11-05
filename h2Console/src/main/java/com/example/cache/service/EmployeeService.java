package com.example.cache.service;

import com.example.cache.domain.Employee;

public interface EmployeeService {
	
	Employee findById(Long empId);
	
	Employee findByName(String empName);

}
