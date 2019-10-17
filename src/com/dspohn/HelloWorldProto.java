package com.dspohn;

public class HelloWorldProto {
	private String message;
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void getMessage() {
		System.out.println("Your prototype message : " + message);
	}
}
