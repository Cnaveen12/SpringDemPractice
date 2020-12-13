package com.love2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
	
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from application context
		CricketCoach coach = context.getBean("myCricketCoach",CricketCoach.class);
		
		//call the methods from the bean
		System.out.println(coach.getWorkoutDetails());
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getEmail());
		System.out.println(coach.getName());
		
		//close the application context
		context.close();

	}

}
