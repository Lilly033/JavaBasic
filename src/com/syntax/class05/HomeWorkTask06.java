package com.syntax.class05;

import java.util.Scanner;

public class HomeWorkTask06 {

	public static void main(String[] args) {

/* Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in March, April, May → season =“Spring” 
if user is born in June, July, August → season =“Summer”  etc …
 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your birth month ");
		String m=scan.nextLine();
		
	if( m.equalsIgnoreCase("January") || m.equalsIgnoreCase("February") || m.equalsIgnoreCase("December")){
		System.out.println("Winter!");}
		
else if(m.equalsIgnoreCase("March")|| m.equalsIgnoreCase("April")||m.equalsIgnoreCase("May")){
	    System.out.println("Spring!");}
		
else if(m.equalsIgnoreCase("June")||m.equalsIgnoreCase("July")||m.equalsIgnoreCase("August")){
		System.out.println("Summer!");
		}
else if(m.equalsIgnoreCase("September")||m.equalsIgnoreCase("October")||m.equalsIgnoreCase("November")){
		System.out.println("Autumn!");
		}
		
			
		
		
		
		
		
		
		
		
		
	}}


