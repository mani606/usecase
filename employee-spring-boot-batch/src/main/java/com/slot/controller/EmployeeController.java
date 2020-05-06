package com.slot.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.slot.entity.Employee;
import com.slot.exception.RecordNotFoundException;
import com.slot.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	private static final Logger logger=LoggerFactory.getLogger(EmployeeController.class);
	
	
	
	@GetMapping("/details")
	public ResponseEntity<List<Employee>> findAllemployees() throws RecordNotFoundException{
		List<Employee> emplist=service.findByAllemp();
		logger.debug("emplist size: "+emplist.size());
		return new ResponseEntity<List<Employee>>(emplist, new HttpHeaders(), HttpStatus.OK);

}}
	