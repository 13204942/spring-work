package com.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container
		Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
		TennisCoachPractice theCoachPractice = context.getBean("theCoachName", TennisCoachPractice.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoachPractice.getCoachName());
		
		// close the context
		context.close();
		
	}

}
