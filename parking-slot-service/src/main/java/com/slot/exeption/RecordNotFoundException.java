package com.slot.exeption;


public class RecordNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public RecordNotFoundException(String errmsg) {
		super(errmsg);
	}
	public RecordNotFoundException(String errmsg,Throwable t) {
		super(errmsg,t);
	}
	
}