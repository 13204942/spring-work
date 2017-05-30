package com.code.springpractice;

import org.springframework.stereotype.Component;

@Component
public class HelloFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Hello my fortuneService";
	}

}
