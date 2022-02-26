package com.syntax.class07;

import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {

	/*2. Ask a user to enter name, last name and age 5 times.
 Every time your program should print those values in a format
  “You name is _ _ and you are _ years old’
	 */
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<5;i++) {
		System.out.println("Please enter your name and your age");
		
		String name=scan.next();
		int age=scan.nextInt();
		

		System.out.println("Your name is "+name+" and you are "+ age+" old!");	
	
		}
		
		
		
		
		
	}

}
