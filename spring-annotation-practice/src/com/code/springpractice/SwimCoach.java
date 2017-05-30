package com.code.springpractice;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Value("${foo.team}")
	private String teamName;
	
	@Value("${foo.email}")
	private String email;
	
	public SwimCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getTeamName() {
		return "The team name is: " + teamName;
	}

	@Override
	public String getEmail() {
		return "The email address is: " +  email;
	}

	public String getFortuneService() {
		return fortuneService.getFortune();
	}

}
