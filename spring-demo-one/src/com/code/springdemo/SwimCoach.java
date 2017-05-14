package com.code.springdemo;

public class SwimCoach implements Coach {
	
	private FortuneService randomRortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Spend 90 mins on swimming";
	}

	@Override
	public String getDailyFortune() {
		return randomRortuneService.getFortune();
	}
	
	// our setter method
	public void setRandomFortuneService(FortuneService fortuneService) {
		System.out.println("SwimCoach: inside setter method - setFortuneService");
		this.randomRortuneService = fortuneService;
	}

}
