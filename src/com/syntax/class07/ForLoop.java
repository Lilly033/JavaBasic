package com.syntax.class07;

public class ForLoop {

	public static void main(String[] args) {
/*
           initialization
            condition
           increment or decrement
 */
		
		for (int i=1; i<=5; i++) {
			
			System.out.println("Hello");
		}
		
		System.out.println("I need to print numbers from 1-20");
		/*
		 * start point
		 * end point
		 * increment or decrement
		 * 
		 * 
		 */
		for (int i=1; i<=20; i++) {
			System.out.print(i+" ");
			
		}
		System.out.println("I need to print numbers from 20-1");
		
		for(int i=20;i>=1;i--) {
			System.out.print(i+" ");
		}
		
	}

}
