package com.love2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringConfigJavaCode {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		Coach coach = context.getBean("swimCoach",Coach.class);
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getWorkoutDetails());
		context.close();
	}

}
