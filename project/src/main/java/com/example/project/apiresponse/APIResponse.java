package com.example.project.apiresponse;

import lombok.Data;

@Data
public class APIResponse {
	private int status;
	private Object data;
	private Object error;
	
	public APIResponse() {
		super();
		this.status = 200;
		this.data = data;
		this.error = error;
	}
	
	

}
