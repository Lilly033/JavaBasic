package com.syntax.class04;

import java.util.Scanner;

public class PracticeTask6 {

	public static void main(String[] args) {

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("How many years have you been working?");
		int years=scan.nextInt();
		if (years>5){
			System.out.println("What is your salary?");
		int salary=scan.nextInt();
		System.out.println("Great news ! Your going to get bonus!");
		if (salary>=50000) {
			System.out.println("Your bonus is $5000!");
		}else {
			System.out.println("Your bonus is $3000!");
		}}else{
			System.out.println("Unfortunately, you can not get the bonus this time!");	
			
		}
		
		}
	}


