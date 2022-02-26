package com.syntax.class04;

import java.util.Scanner;

public class PracticeTask4 {

	public static void main(String[] args) {

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Do you have a credit card? Please list as Yes or No");
		
		String creditCard=scan.next();
		
		if(creditCard.equalsIgnoreCase("Yes")) {
		
			System.out.println("What is the balance of your credit card?");
			double balance=scan.nextDouble();
			
			if(balance>1000) {
				
				System.out.println("Pay of the $"+balance+" immediately!!!");
			}else {
				System.out.println("You can spend more");}
			}else { 
				System.out.println("Would you like to sign up for the credit card?");	
		
			
}
	
		
}
}

