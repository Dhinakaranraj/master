package com.example.project.common;

import java.util.List;


public class BadRequestException extends RuntimeException {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List<Error> errors;


	public BadRequestException(String message,List<Error> errors) {
		super(message);
		this.errors=errors;
	}


	public List<Error> getErrors() {
		return errors;
	}

	public void setErrors(List<Error> errors) {
		this.errors = errors;
	}

}
