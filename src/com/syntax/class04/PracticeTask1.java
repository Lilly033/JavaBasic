package com.syntax.class04;

import java.util.Scanner;

public class PracticeTask1 {

	public static void main(String[] args) {

		
		
		Scanner scan=new Scanner (System.in);
		System.out.println("How much money would you like to borrow ?");
				int loan = scan.nextInt();
				if (loan<=200000) {
		System.out.println("We can loan you the " + loan + " you are requesting !");	
				}else {
	    System.out.println("Unfortunately, we cannot loan you the "+ loan+ " you are requasting !");			
				}
	}

}
