package com.love2code.springdemo;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class SwimmingCoach implements Coach{
	private FortuneService fortuneService;

	@Override
	public String getWorkoutDetails() {
		return "Do skipping rope every day for 1hour please!";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}
	

}
