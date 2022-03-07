package com.someshium.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.someshium.test.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	

}
