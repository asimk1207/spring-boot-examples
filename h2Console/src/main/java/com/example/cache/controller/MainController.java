package com.example.cache.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.cache.domain.Employee;
import com.example.cache.service.EmployeeService;

@RestController
@RequestMapping("/demo")
public class MainController {
	
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/home")
    public @ResponseBody String home() {
		
		Employee employee = employeeService.findById(100L);
		
        return "Welcome " + employee.getName() + " !!! ";
    }
	
}
