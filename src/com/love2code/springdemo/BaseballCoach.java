package com.love2code.springdemo;

public class BaseballCoach implements Coach {
	
	
	

	public BaseballCoach() {

	}
	
	public void doInitOfBean(){
		System.out.println( "do something initially");
	}
	public void doForDestoryBean(){
		System.out.println("destoryed bean. close db connection.");
	}
	
	

	@Override
	public String getWorkoutDetails() {
		return "Run around the ground!";
	}



	@Override
	public String getDailyFortune() {
		
		return "super day for you man!";
	}

	
}
