package com.slot.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.slot.exeption.RecordNotFoundException;

@FeignClient(name = "http://employeeservice/employee")
public interface EmployeeClient {
	
	
	//public ResponseEntity<List<Employee>> findAllemployees() throws RecordNotFoundException;

}