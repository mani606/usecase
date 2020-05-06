package com.slot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.slot.entity.AvailableSlot;
import com.slot.entity.ParkingSlot;
import com.slot.repository.ParkingSlotRepository;

@Service
public class ParkingSlotService {
	@Autowired
	private ParkingSlotRepository repository;
	private Object date;

	public List<ParkingSlot> findAll() {

		return repository.findAll();
	}

	public AvailableSlot getAllocatedSlot() {
		// TODO Auto-generated method stub
		return (AvailableSlot) repository.findAll();
	}
	//List<ParkingSlot> details = repository.getParkingSlot(date)


	//return repository.getAllocateDetails(details);
}

