package com.nissan.bean;

import org.springframework.stereotype.Component;

import com.nissan.service.ICoach;
@Component
public class BaseBall implements ICoach {

	@Override
	public String getDailyWorkout() {
	
		return "Spent 40 min on batting ";
	}

}
