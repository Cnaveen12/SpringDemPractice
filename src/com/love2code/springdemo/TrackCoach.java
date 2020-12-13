package com.love2code.springdemo;

public class TrackCoach implements Coach {
	
	//Define a private field for dependency 
	private FortuneService fortuneService;
	
	//Define a constructor in class to inject fortune service.
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getWorkoutDetails() {

		return "Run in the track continously for an hour!";
	}

	@Override
	public String getDailyFortune() {
		//Use fortuneService to get daily fortune		
		return fortuneService.getFortune();
	}

}
