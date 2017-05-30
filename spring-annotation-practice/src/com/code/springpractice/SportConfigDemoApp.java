package com.code.springpractice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.code.springpractice.SportConfig;

public class SportConfigDemoApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from spring container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeamName());
		System.out.println(theCoach.getFortuneService());
		
		// close the context
		context.close();
	}

}
