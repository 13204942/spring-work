package com.code.springpractice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	@Bean
	public FortuneService helloFortuneService() {
		return new HelloFortuneService();
	}
	
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(helloFortuneService());
	}

}
