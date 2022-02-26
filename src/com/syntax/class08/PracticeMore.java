package com.syntax.class08;

public class PracticeMore {

	public static void main(String[] args) {

		int value=1;
		for(int i=1; i<4; i++) {
			value*=i;
		}
		
		System.out.println(value);
		
		/*all even and odd numbers from 1-50
		 * 
		 */
		
	   
		int sumEven=0;
		int sumOdd=0;
		for(int i=1; i<=50; i++) {
		if(i %2==0) {	
			
			sumEven+=i;	   //sumEven=sumEven+i;
			
		}else {
			sumOdd=sumOdd+i;
		}
		
		}
		System.out.println("The sum of all even numbers= "+ sumEven+ 
				" add of all odd numbers= "+ sumOdd); 
	

}}
