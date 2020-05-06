package com.slot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slot.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	
	

}
