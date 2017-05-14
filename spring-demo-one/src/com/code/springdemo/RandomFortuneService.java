package com.code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private String[] fortuneArray = new String[3];
	@Override
	public String getFortune() {
		fortuneArray[0] = "Today is my first fortune day";
		fortuneArray[1] = "Today is my second fortune day";
		fortuneArray[2] = "Today is my third fortune day";
		int randomIndex = new Random().nextInt(fortuneArray.length);
		return fortuneArray[randomIndex];
	}

}
