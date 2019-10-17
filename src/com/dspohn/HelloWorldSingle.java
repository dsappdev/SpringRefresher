package com.dspohn;

public class HelloWorldSingle {
	private String message;
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void getMessage() {
		System.out.println("Your singleton message : " + message);
	}
	
	public void init() {
		System.out.println("Bean is initializing.");
	}
	
	public void destroy() {
		System.out.println("The bean will be destroyed now.");
	}
}
