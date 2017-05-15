package com.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCyclePracticeApp {

	public static void main(String[] args) {
		
		// load the spring configuration file\
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScopePractice-applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// test bean lifecycle
		//System.out.println(theCoach.getDailyWorkout());
		
		// test prototype bean
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// check if they are the same
		boolean result = (theCoach == alphaCoach);
		
		// print out the results
		System.out.println("\nPointing to the same object: " + result);
		System.out.println("\nMemory location for theCoach: " + theCoach);
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach);
		
		// close the context
		context.close();
	}

}
