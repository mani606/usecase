package com.slot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slot.entity.ParkingSlot;
import com.slot.repository.ParkingSlotRepository;

@Service
public class ParkingSlotService {
	@Autowired
	private ParkingSlotRepository repository;

	public List<ParkingSlot> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	
}
