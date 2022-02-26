package com.syntax.class13;

public class Task2 {
	//Create a method that will take a number and prints whether the number is even or odd.

	int evenOdd(int num1) {
		if(num1%2==0 ) {
			System.out.println(num1+" Number is even");
		}else {
			System.out.println(num1+ " Number is odd");
			
		}
		return num1;
	}
	public static void main(String[] args) {
		
	Task2 obj=new Task2();
	System.out.println(obj.evenOdd(11));

	}

}
