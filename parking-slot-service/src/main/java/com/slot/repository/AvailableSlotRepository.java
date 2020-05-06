package com.slot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slot.entity.AvailableSlot;


public interface AvailableSlotRepository  extends JpaRepository<AvailableSlot,Integer> {

}
