package com.nissan.app;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nissan.service.IPatient;

public class PatientApp {
	public static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		int mainChoice;
		do {
		 mainChoice=mainMenu();
		switch(mainChoice) {
		case 1:
			usingApplicationContext();
			break;
			
		case 2:
			usingBeanFactory();
			break;
		case 0:
			System.out.println("Exited Sucessfully.. Thank you.");
			break;
		default:
			break;
		}
		}while(mainChoice!=0);
}

	
	public static int mainMenu() {
		int choice ;
		System.out.println("\n-------------------------------\n"
				+ "1.using applicationcontext file\t2.using bean factory file\t0.Exit \n"
				+ "-------------------------------");
		System.out.println("Enter your choice: ");
		choice=sc.nextInt();
		return choice;
	}
	
	public static void usingApplicationContext() {
		try {
			ClassPathXmlApplicationContext context=
					new ClassPathXmlApplicationContext("applicationContext.xml");
			int choice;
			IPatient patient;
			
			try {
			do {
				System.out.println("Using application context");
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
		}catch(Exception e) {
			System.out.println("Something went wrong..."+e.getMessage());
		}
	}
	
	public static void usingBeanFactory() {
		try {
			
			BeanFactory factory = new ClassPathXmlApplicationContext("beanFactoryDemo.xml");
			
			int choice;
			IPatient patient;
			
			try {
			do {
				System.out.println("Using bean factory");
				System.out.println("\n-------------------------------\n"
						+ "1.Bills\t2.Medicine\t0.Exit \n"
						+ "-------------------------------");
				System.out.println("Enter your choice: ");
				choice=sc.nextInt();
				switch(choice) {
				case 1:
					patient= factory.getBean("bills",IPatient.class);
					System.out.println(patient.getMedicineAndBills());
					break;
				case 2:
					patient= factory.getBean("medicine",IPatient.class);
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
		}catch(Exception e) {
			System.out.println("Something went wrong..."+e.getMessage());
		}
	}
}
