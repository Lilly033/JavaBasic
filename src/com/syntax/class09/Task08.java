package com.syntax.class09;

public class Task08 {

	public static void main(String[] args) {
/*From an array of integer elements find the largest number.
 */
	      int[]	number= {9,99,999,77,77777,7,1};
	
		  int largest=number[0];
		  
		  for(int i=1; i < number.length; i++) {
		  if(number[i] > largest) {
		  largest=number[i];
		}
		}
		System.out.println("The largest number is "+largest);
		
		 largest=number[0];
		for(int n:number) {
			if ( n>largest) {
				largest=n;
			}}
		System.out.println(largest);
		
		
	}

}
