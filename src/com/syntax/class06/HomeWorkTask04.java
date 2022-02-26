package com.syntax.class06;

import java.util.Scanner;

public class HomeWorkTask04 {

	public static void main(String[] args) {
		/*HW:  Using scanner class create calculator. 
		 *     Allow user to enter 2 numbers and operator(+,-,*,/). 
		 *     Based on operator provide the result to user.
	           Please complete this assignment in 2 ways: using if statement and switch case.
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter two numbers");
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		System.out.println("Please enter the operator: +, -, *, /,");
		char operator=scan.next().charAt(0);
		int resolt=0;
		    switch(operator) {
		case '+':
		resolt=n1+n2;
		    break;
		case '-':
			resolt=n1-n2;
			break;
		case '*':
			resolt=n1*n2;
			break;
		case '/':
			if (n2!=0) {
			
			resolt=n1/n2;
		    }else {
		    	
			System.out.println("We cannot devide a number by " +n2);}
			break;
	}
		System.out.println("The resolt is "+ resolt);
		
		
		
		
		
		
		
		
		
		
	}

}
