package com.love2code.springdemo;

public class CricketCoach implements Coach{
	
	private String email;
	private String name;
	private FortuneService fortuneService;
	
	public CricketCoach(){
		
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getEmail(){
		return this.email;
	}
	public String getName(){
		return this.name;
	}
	public void setFortuneService(FortuneService fortuneService){
		this.fortuneService = fortuneService;
	}

	@Override
	public String getWorkoutDetails() {		
		return "Bowling fast is enough workout for you!";		
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
