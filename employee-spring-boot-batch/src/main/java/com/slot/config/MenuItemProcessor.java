
package com.slot.config;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.batch.item.ItemProcessor;

import com.slot.entity.Employee;



public class MenuItemProcessor implements ItemProcessor<Employee ,Employee>{
	
	@Override
	public Employee process(Employee employee) throws Exception {
		
	    final String employeeName = employee.getEmployeeName();  
	    final String email = employee.getEmail();
	  
	    
	    final Long phoneNumber = employee.getPhoneNumber();
	    final String designation= employee.getDesignation();
	    final int yearsOfExperience = employee.getYearsOfExperience();

	    final Employee processedItem = new Employee(1,employeeName,email,phoneNumber,designation,yearsOfExperience);
	    return processedItem;
	  }

	
		
	}

	

