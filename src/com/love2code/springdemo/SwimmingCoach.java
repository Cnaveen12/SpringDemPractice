package com.love2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class SwimmingCoach implements Coach{
	
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	

	@Override
	public String getWorkoutDetails() {
		return "Do skipping rope every day for 1hour please!";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}
	

}
