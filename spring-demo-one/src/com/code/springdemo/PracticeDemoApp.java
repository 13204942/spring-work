package com.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeDemoApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		SwimCoach swimCoach = context.getBean("mySwimCoach", SwimCoach.class);
		
		// call methods on the bean
		System.out.println(swimCoach.getDailyFortune());
		System.out.println(swimCoach.getDailyWorkout());
		
		// call our new methods to get the literal values
		
		// close the context
		context.close();

	}

}
