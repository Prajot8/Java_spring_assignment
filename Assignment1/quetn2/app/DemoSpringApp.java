package com.nissan.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nissan.service.ICoach;
import com.nissan.service.IFortune;

public class DemoSpringApp {

	public static void main(String[] args) {
		/*
		//regular method  -non effective 
		TrackBall trackball=new TrackBall();
		//trackball.display();
		System.out.println(trackball.getDailyWorkout());
		
		BaseBall baseball= new BaseBall();
		System.out.println(baseball.getDailyWorkout());
		
		*/
		/*
		ICoach coach= new BaseBall();
		System.out.println(coach.getDailyWorkout());
		
		coach= new TrackBall();
		System.out.println(coach.getDailyWorkout());
		*/
		
		
		//Spring IOC Container configure with ApplicationContext File
		//read Spring application context file
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve beans from IOC container
		//ICoach baseBall= context.getBean("baseBall",ICoach.class);
		//System.out.println(baseBall.getDailyWorkout());
		//ICoach baseBall= context.getBean("trackBall",ICoach.class);
		//System.out.println(baseBall.getDailyWorkout());
		
		//Fortune tester app
		IFortune f1= context.getBean("fortuneMaker",IFortune.class);
		System.out.println(f1.getFortune());
	
		
	}

}
