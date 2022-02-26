package com.syntax.class13;

import java.util.Scanner;

public class MethodsDemo1 {
	//void is type of methods that dont return anything when called
	//checkEvenOdd is the name of the method
	//() wenuse to pass information from outside
	//int number this is parametar that we can pass to this method when called
	//we can use this variable inside the logic of method
	
	void checkEvenOdd(int number) {
		//System.out.println(number);
		if(number%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}	
		}
		void checkWether(boolean isRaining) {
			if(isRaining) {
				System.out.println("im staying home");
			}else {
				System.out.println("lets gi for the walk");
			}
		}
	void checkPerson(String name) {
		if("Teyfur".equals(name)) {
			System.out.println("memer");
		}else if("Maha".equals(name)) {
			System.out.println("Doctor");
		}else {
			System.out.println("Unknown");
		}
		
	}

	public static void main(String[] args) {

		MethodsDemo1 object1 =new MethodsDemo1();
		object1.checkEvenOdd(3);
		object1.checkEvenOdd(10);
		object1.checkEvenOdd(17);
		object1.checkEvenOdd(121);
		object1.checkWether(false);
		object1.checkPerson("Teyfur");
		object1.checkPerson("Maha");
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
	}

}
