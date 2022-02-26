package com.syntax.class09;

public class Recap {

	public static void main(String[] args) {

		for (int i=1;i<=2;i++) {
			System.out.print("A");
			//break;
			System.out.print("B");
		}
		
		System.out.println("--------------------");
		for(int i=1;i<=3;i++) {    //outer loop controle number of compleate interation of inner loop
			for(int j=1;j<=3;j++) {  //inner loop always depends on outer
				System.out.println("Hello");
				
			}
			System.out.println("Good Morning");
			continue;
			
		}
		
		System.out.println("--------------------");
		for(int i=1;i<=3;i++) {    //outer loop controle number of compleate interation of inner loop
			for(int j=1;j<=3;j++) {  //inner loop always depends on outer
				System.out.println("Hello");
				break;
			}
			System.out.println("Good Morning");
			
	}
          /////TRY THIS WITH CONTINUE TOO
}}
