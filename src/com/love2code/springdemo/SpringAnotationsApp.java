package com.love2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnotationsApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("annotations-applicationContext.xml");
		
		Coach coach = context.getBean("thatSillyCoach",Coach.class);
		
		System.out.println(coach.getWorkoutDetails());
		context.close();
	}

}
