package com.code.springdemo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

	// load values from file
	@Value("${db.username}")
	private String username;
	
	@Value("${db.password}")
	private String password;
	
	@Value("${db.port}")
	private String port;
	
	// create an array of strings
	private String[] data = new String[3];
	
	// create a random number generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		data[0] = username;
		data[1] = password;
		data[2] = port;
		
		int index =  myRandom.nextInt(data.length);
		String theFortune = data[index];
		return theFortune;
	}

}
