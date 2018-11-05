package com.example.cache.service.impl;

import static java.util.concurrent.TimeUnit.SECONDS;

import javax.cache.CacheManager;
import javax.cache.annotation.CacheDefaults;
import javax.cache.annotation.CacheResult;
import javax.cache.configuration.MutableConfiguration;
import javax.cache.expiry.Duration;
import javax.cache.expiry.TouchedExpiryPolicy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cache.JCacheManagerCustomizer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.cache.domain.Employee;
import com.example.cache.repository.EmployeeRepository;
import com.example.cache.service.EmployeeService;

@Service
@CacheDefaults(cacheName = "employee")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	// create cache
	/*@Component
	public static class CachingSetup implements JCacheManagerCustomizer {
		@Override
		public void customize(CacheManager cacheManager) {
			cacheManager.createCache("employee",
					new MutableConfiguration<>()
							.setExpiryPolicyFactory(TouchedExpiryPolicy.factoryOf(new Duration(SECONDS, 10)))
							.setStoreByValue(false).setStatisticsEnabled(true));
		}
	}*/

	@CacheResult
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
