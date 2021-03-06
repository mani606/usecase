package com.slot.service;

import java.util.List;
import java.util.logging.Logger;

import javax.transaction.Transactional;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slot.entity.Employee;
import com.slot.exception.RecordNotFoundException;
import com.slot.repository.EmployeeRepository;


@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository repository;
	
	private static final org.jboss.logging.Logger logger=LoggerFactory.logger(EmployeeService.class);
	
	
	public Employee retrieve(int employeeId) {
		// TODO Auto-generated method stub
		return repository.getOne(employeeId);
	}
	public List<Employee> findByAllemp() throws RecordNotFoundException {
		List<Employee> emplist=repository.findAll();
		if(emplist.size()==0) {
			logger.debug("No employee Records");
			throw new RecordNotFoundException("No employee Records");
		}
		return emplist;
	}

	
}
