package com.jonathan.cursomc.services.exceptions;

public class ObjectNotFoundExcepton extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundExcepton(String msg) {
		super(msg);
	}
	
	public ObjectNotFoundExcepton(String msg, Throwable cause) {
		super(msg, cause);
	}
	
}
