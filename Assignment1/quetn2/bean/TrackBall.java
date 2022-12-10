package com.nissan.bean;

import org.springframework.stereotype.Component;

import com.nissan.service.ICoach;

@Component
public class TrackBall implements ICoach{

	@Override
	public String getDailyWorkout() {
		
		return "Run Track: fast run of 25KM";
	}
	
	
	/*
	public static void display() {
		System.out.println("Performance Report..");
	}
	*/
	
	
	
}
