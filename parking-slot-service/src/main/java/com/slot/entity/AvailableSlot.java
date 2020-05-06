package com.slot.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class AvailableSlot{
	private int id;
	private int slotid;
	private Date fromdate;
	private Date todate;
	@ManyToOne(cascade = CascadeType.ALL)  
	@JoinColumn(name="emp_id")
	private Emp emp;
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSlotid() {
		return slotid;
	}
	public void setSlotid(int slotid) {
		this.slotid = slotid;
	}
	public Date getFromdate() {
		return fromdate;
	}
	public void setFromdate(Date fromdate) {
		this.fromdate = fromdate;
	}
	public Date getTodate() {
		return todate;
	}
	public void setTodate(Date todate) {
		this.todate = todate;
	}
	public AvailableSlot() {
		super();
	}
	public AvailableSlot(int id, int slotid, Date fromdate, Date todate) {
		super();
		this.id = id;
		this.slotid = slotid;
		this.fromdate = fromdate;
		this.todate = todate;
	}

}


