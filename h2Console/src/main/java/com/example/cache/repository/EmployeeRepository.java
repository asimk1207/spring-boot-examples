package com.example.cache.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cache.domain.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	Employee findByName(String empName);

}
