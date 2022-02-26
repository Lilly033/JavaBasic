package com.syntax.class07;

import java.util.Scanner;

public class Task08Corections {

	public static void main(String[] args) {

		 /*Declare a variable to store a price for a coffee.
		   *  Ask user to pay for a coffee. 
		   *  Keep asking to pay for coffee until user enters exact amount . 
		   *  If user give more than price--> ask them to give less, if user gives less money then ask to give more. 
		   *  Once user got a write amount print “Please enjoy your candy”
		   */
		Scanner scan=new Scanner(System.in);
		double price=2.99;
		
		System.out.println("Please pay for your coffe");
		double pay;
		
		do {
		pay=scan.nextDouble();
		
		if(pay>price) {
			System.out.println("Please give less money");
		}else if(pay<price) {
			System.out.println("Please give more money");
		}
		}while(pay !=price);
		System.out.println("Please enjoy your candy!");
		
		//FIX IT BY YOUR SELF STUPID
		
		//its fixed
		
		
		
		
}
		
		
		
		
		
		
		
		
	}


