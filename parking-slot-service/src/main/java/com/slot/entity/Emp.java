package com.slot.entity;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class Emp {

	private int empId;
	private String empMail;
	private int days;
	@ManyToOne(cascade = CascadeType.ALL)  
	@JoinColumn(name="slot_id")
	private ParkingSlot parkingslot;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpMail() {
		return empMail;
	}
	public void setEmpMail(String empMail) {
		this.empMail = empMail;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public ParkingSlot getParkingslot() {
		return parkingslot;
	}
	public void setParkingslot(ParkingSlot parkingslot) {
		this.parkingslot = parkingslot;
	}

}


