package com.syntax.class04;

import java.util.Scanner;

public class PracticeTask2 {

	public static void main(String[] args) {

		//Task2//
		
		Scanner scan=new Scanner (System.in);
		System.out.println("How old are you? ");
		
		  int age =scan.nextInt();
		  if (age>=18) {
		System.out.println(" You are eligible to get driver licens!");	
		  }else {
		System.out.println("You are not eligible for the driver licens! But you can get Lerners Permit!");	
		}
		
		
		
		
		
		
	}

}
