package com.code.springdemo;

import org.springframework.stereotype.Component;

@Component("theCoachName")
public class TennisCoachPractice implements CoachPractice {

	@Override
	public String getCoachName() {
		return "The Coach name is Michael";
	}

}
