package com.dspohn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	/**
	 * Working with Beans
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");		
		HelloWorldSingle objA = (HelloWorldSingle) context.getBean("helloWorldSingleton");
		
		// Setting the message
		objA.setMessage("I'm object A");
		objA.getMessage();
		
		// Since the message was already set for the bean that is what will be returned
		HelloWorldSingle objB = (HelloWorldSingle) context.getBean("helloWorldSingleton");
		objB.getMessage();
		
		System.out.println();
		
		// The message is set for this bean
		HelloWorldProto objC = (HelloWorldProto) context.getBean("helloWorldPrototype");
		objC.setMessage("I'm object C");
		objC.getMessage();
		
		// This will print out "null" since no message was added in this request.
		HelloWorldProto objD = (HelloWorldProto) context.getBean("helloWorldPrototype");
		objD.getMessage();
	}
}
