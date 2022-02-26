package com.syntax.class04;

import java.util.Scanner;

public class PracticeForScanerClass04 {

	public static void main(String[] args) {

		
		
		Scanner scan=new Scanner(System.in);  //create a scanner
		//if you want to capture single string-usenext();
		
		System.out.println(" Please enter your name ");
		
		String name =scan.next();  
		
		//type string and hit enter
		
		System.out.println(name);
		System.out.println( " Whats your age ");
		int age=scan.nextInt();
		int code=2989;
		System.out.println(name+" "+age);
		String username=" Las Vegas ";
		System.out.println(name +" "+age +username +code);
		
		 		
		
		
		
		
		
		
		
		
		
	}

}
