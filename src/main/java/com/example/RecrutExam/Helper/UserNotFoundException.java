package com.example.RecrutExam.Helper;

public class UserNotFoundException extends RuntimeException{

	

	
	public UserNotFoundException(String message) {
		
		super(message);
		
	}
	

	public UserNotFoundException(String message, Throwable cause) {
		
		super(message, cause);
		
	}
	
	
	
}
