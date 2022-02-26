package com.syntax.class05;

import java.util.Scanner;

public class HomeWorkTask02 {

	public static void main(String[] args) {

		/*Write a program that will print whetheit is a weekend or weekday. 
		 * If any day from 1-5 → output “It is a weekday”, anyday from 6-7 → output “It is a weekend”,
		 *  any other day → output “Invalid day”
		 */
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter the number of the day 1-7");
		int day=scan.nextInt();
		if (day>=1 && day<=5) {
			System.out.println("Weekday");
		}	
		else if	( day==6 || day==7) {
			System.out.println("Weekend");
		
	    }else 
		System.out.println("Invalid day");
		
}
		
		
		
		
		
}


