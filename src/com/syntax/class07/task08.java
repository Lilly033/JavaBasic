package com.syntax.class07;

import java.util.Scanner;

public class task08 {

	public static void main(String[] args) {
  /*Declare a variable to store a price for a coffee.
   *  Ask user to pay for a coffee. 
   *  Keep asking to pay for coffee until user enters exact amount . 
   *  If user give more than $3 --> ask them to give less, if user gives less money then ask to give more. 
   *  Once user got a write amount print “Please enjoy your candy”
   */
		
		int coffePrice=5;
		Scanner scan=new Scanner (System.in);
		int payCoffe;
		
		do {
			System.out.println("Please pay for your coffe");
			payCoffe=scan.nextInt();
			
		}while(payCoffe!=coffePrice);
			
			System.out.println("Please enjoy your candy");
			
			
		
		
		
		
		
		
		
		
	}

}
