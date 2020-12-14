package com.love2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
	
	//define a bean for SadFortuneService
	@Bean
	public FortuneService sadFortuneService(){
		return new SadFortuneService();
	}
	
	//define a bean for SwimCoach and inject SadFortuneService
	@Bean
	public Coach swimCoach(){
		return new SwimCoach(sadFortuneService());
	}

}
