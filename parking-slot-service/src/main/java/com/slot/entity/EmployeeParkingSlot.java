package com.slot.entity;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class EmployeeParkingSlot {

	 private int id;
	 
	 @ManyToOne(cascade = CascadeType.ALL)  
	 @JoinColumn(name="employee_id")
		private Employee employee;
	 
	 @ManyToOne(cascade = CascadeType.ALL)  
	 		@JoinColumn(name="slot_id")
	 private ParkingSlot parkingslot;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public ParkingSlot getParkingslot() {
		return parkingslot;
	}

	public void setParkingslot(ParkingSlot parkingslot) {
		this.parkingslot = parkingslot;
	}
	 
	 
}



