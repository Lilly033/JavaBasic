package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {

		boolean likeJava=true;
		boolean practice=true;
		boolean understandJava=true;
		
		if(likeJava && understandJava && practice) {
			System.out.println("This is best combination");
		}
			System.out.println("End of program");	
		
		// we can compere 3 numbers
		/*
		 * if n1>n2 &&	n1>n3      //n1 is the largest
		 * what if n2>n1 && n2>n3  //n2 is the largest
		 * what if n3>n1 && n3>n2  //n3 is the largest
		 */
			
			int n1=100;
			int n2=2000;
			int n3=500;
			
			if(n1>n2 && n1>n3) {
			
			System.out.println(n1+ "is the largest");
			}else if (n2>n1 && n2>n3) {
				
			System.out.println(n2+ " is the largest");
			}else if (n3>n1 && n3>n2) {
			System.out.println(n3+ "is the largest");
			
			
			
			
			
			
			
			
			
		
		
	}

}}
