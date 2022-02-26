package com.syntax.class08;

public class ContinueKeyWord {

	public static void main(String[] args) {

		for(int i=1; i<=5; i++) {
			
			if(i==3) {
				continue;  //skip current interation/cycle
			}
			System.out.println("Hello "+i);
			System.out.println("We are batch 12");
		}
		// i want to print all numbers from 1 to 10 exsept number 4
		
		for(int i=1;i<=10;i++) {
			if(i==4|| i==7) {
				
				continue;
			}
			System.out.print(i+" ");
		}
		
		
		
	}

}
