package com.slot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class ParkingSlot	{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String block;
	private String wing;
	private int location;
	private String building;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBlock() {
		return block;
	}
	public void setBlock(String block) {
		this.block = block;
	}
	public String getWing() {
		return wing;
	}
	public void setWing(String wing) {
		this.wing = wing;
	}
	public int getLocation() {
		return location;
	}
	public void setLocation(int location) {
		this.location = location;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public ParkingSlot() {
		super();
	}
	public ParkingSlot(int id, String block, String wing, int location, String building) {
		super();
		this.id = id;
		this.block = block;
		this.wing = wing;
		this.location = location;
		this.building = building;
	}

}

