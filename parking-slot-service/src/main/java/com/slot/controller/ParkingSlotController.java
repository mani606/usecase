package com.slot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.slot.entity.ParkingSlot;
import com.slot.repository.ParkingSlotRepository;
import com.slot.service.ParkingSlotService;

@RestController
@RequestMapping("/slots")
public class ParkingSlotController {
	@Autowired
	private ParkingSlotService service;
	
	
	
	
	@GetMapping()
	public List<ParkingSlot> getParkingSlots() {
		return service.findAll();
	}
	
	
	
    


	

}
