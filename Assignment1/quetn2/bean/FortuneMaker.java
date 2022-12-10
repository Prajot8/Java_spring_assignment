package com.nissan.bean;

import java.util.Random;

import org.springframework.stereotype.Component;

import com.nissan.service.IFortune;
@Component
public class FortuneMaker implements IFortune {
	
	@Override
	public String getFortune() {
		/*
		String numbers = "012";
		Random objRandom = new Random();
		double a=Math.random()*10;
		int j=(int)a;
		//char i=numbers.charAt(objRandom.nextInt(numbers.length()));
		
		//arrFortune[Integer.parseInt(i)]
		//System.out.println(a);
		//System.out.println(j);
		//int j=a;
		*/
		String arrFortune[]= new String[] {"Smart Watch","IPhone14","Luxury Car"};
		Random rand = new Random();
		int randomnumber = rand.nextInt(3);
		return "Congratulations... You have received \n***************"
				+arrFortune[randomnumber]+"***************";
	}

}
