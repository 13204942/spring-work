package com.code.springdemo;

public class SwimCoach implements Coach {
	
	@Override
	public String getDailyWorkout() {
		return "Spend 90 mins on swimming";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

}
