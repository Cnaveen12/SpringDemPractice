package com.love2code.springdemo;

public class SwimCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService fortuneService){
		this.fortuneService = fortuneService;
	}

	@Override
	public String getWorkoutDetails() {
		return "Swim regulary 1000 meters every day!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
