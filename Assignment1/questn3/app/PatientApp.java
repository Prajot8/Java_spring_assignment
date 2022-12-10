package com.nissan.app;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nissan.service.IPatient;

public class PatientApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		int choice;
		IPatient patient;
		Scanner sc= new Scanner(System.in);
		try {
		do {
			System.out.println("\n-------------------------------\n"
					+ "1.Bills\t2.Medicine\t0.Exit \n"
					+ "-------------------------------");
			System.out.println("Enter your choice: ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				patient= context.getBean("bills",IPatient.class);
				System.out.println(patient.getMedicineAndBills());
				break;
			case 2:
				patient= context.getBean("medicine",IPatient.class);
				System.out.println(patient.getMedicineAndBills());
				break;
			case 0:
				System.out.println("Exited Sucessfully.. Thank you.");
				break;
			default:
				System.out.println("Invalid choice....");
				
				break;
			}
		}while(choice!=0);
		}catch(Exception e) {
			System.out.println("Something went wrong..."+e.getMessage());
		}
	}

}
