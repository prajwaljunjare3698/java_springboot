package com.hotel.exception;

public class ResourceNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(String msg) {
		super(msg);
	}	
	public ResourceNotFoundException() {
		super("resource not found....");
	}
}
