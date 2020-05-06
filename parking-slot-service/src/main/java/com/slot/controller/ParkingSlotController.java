package com.slot.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slot.client.EmployeeClient;
import com.slot.entity.AvailableSlot;
import com.slot.entity.Employee;
import com.slot.entity.ParkingSlot;
import com.slot.exeption.RecordNotFoundException;
import com.slot.repository.ParkingSlotRepository;
import com.slot.service.ParkingSlotService;

@RestController
@RequestMapping("/slots")
public class ParkingSlotController {
	@Autowired
	private ParkingSlotService service;
	
	@Autowired
	EmployeeClient client;
	
	@GetMapping()
	public List<ParkingSlot> getParkingSlots() {
		return service.findAll();
	}
	
	private static final Logger logger=LoggerFactory.getLogger(ParkingSlotController.class);

	private static final Object Employee = null;
	@GetMapping
	
	public AvailableSlot allocateSlotForEmployee(String employeeeId)
	{
		
		return service.getAllocatedSlot();
		
	}
	@GetMapping
	public boolean findAllemployees() throws RecordNotFoundException{
		logger.debug("Enter findAllemployees method ");
		return client.equals(Employee);
	}	
	
	
	

}
