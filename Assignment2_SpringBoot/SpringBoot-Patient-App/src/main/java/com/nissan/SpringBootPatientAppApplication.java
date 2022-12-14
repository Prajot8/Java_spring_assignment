package com.nissan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootPatientAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPatientAppApplication.class, args);
		System.out.println("Patient Registration system is started sucessfully....");
	}

}
