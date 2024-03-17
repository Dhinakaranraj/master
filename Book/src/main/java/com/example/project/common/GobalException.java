package com.example.project.common;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GobalException {
	
	//ArithematicException
	
	@ExceptionHandler
	public ResponseEntity<?> handleException(ArithmeticException ex) {
		
		APIResponse api=new APIResponse();
		api.setError("division by zero exception or an arithmetic error!");
		api.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
		api.setData(" something error you get solve that then show your data!");
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR.value()).body(api);
	}
		
	//Normal Exception
	
	    @ExceptionHandler
		public ResponseEntity<?> handle(Exception ex) {
			
			APIResponse api=new APIResponse();
			api.setError("Oops... somethig went wrong!");
			api.setStatus(HttpStatus.BAD_REQUEST.value());
			api.setData("something error you get solve that then show your data!");
			
			return ResponseEntity.status(HttpStatus.BAD_REQUEST.value()).body(api);
	}
	    
    //Empty fields Exception
	    
	    @ExceptionHandler
	    public ResponseEntity<?> fieldException(BadRequestException ex){
	    	APIResponse error=new APIResponse();
	    	error.setError(ex.getErrors());
	    	error.setStatus(HttpStatus.BAD_REQUEST.value());
	    	error.setData("fields error you slove that");
	    	
	    	return ResponseEntity.status(400).body(error);
	    }
	    
	    
	    
}
