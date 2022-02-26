package com.syntax.class06;

import java.util.Scanner;

public class HomeWorkTask02 {

	public static void main(String[] args) {

	/*HW:  Using scanner class create calculator. 
	 *     Allow user to enter 2 numbers and operator(+,-,*,/). 
	 *     Based on operator provide the result to user.
           Please complete this assignment in 2 ways: using if statement and switch case.
	 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the two numbers");
		
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		
		System.out.println("Please enter the operator: +, -, *, /,");
		
		String operator=scan.next();
		int result=0;
		if(operator.equals("+")) {
			result=n1+n2;
		}
		else if(operator.equals("-")) {
			result=n1-n2;
		}
		else if(operator.equals("*")){
             result=n1*n2;
		}
		else if(operator.equals("/")) {
			result=n1/n2;
		}
		else {
			System.out.println("Error");
		}
             
          System.out.println("The result is "+result)  ; 
             
             
}
}