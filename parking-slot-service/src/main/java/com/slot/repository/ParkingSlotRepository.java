package com.slot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slot.entity.ParkingSlot;

@Repository
public interface ParkingSlotRepository extends JpaRepository<ParkingSlot, Integer> {

	List<ParkingSlot> getParkingSlot(Object date);

}
