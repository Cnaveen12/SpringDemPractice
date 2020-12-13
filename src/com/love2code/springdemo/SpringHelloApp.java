package com.love2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
	
	public static void main(String[] args) {
		
		
		//load spring configuration file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach theBaseballCoach = context.getBean("myCoach", Coach.class);
		
		//call methods from bean
		
		System.out.println(theCoach.getWorkoutDetails());
		System.out.println(theBaseballCoach.getWorkoutDetails());
		
		System.out.println(theCoach == theBaseballCoach);
		System.out.println(theCoach.toString()+"\n"+theBaseballCoach.toString());
		
		//close the Application context
		
		context.close();
		
		

	}
}
