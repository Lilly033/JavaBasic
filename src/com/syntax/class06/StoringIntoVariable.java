package com.syntax.class06;

import java.util.Scanner;

public class StoringIntoVariable {

	public static void main(String[] args) {

Scanner scan=new Scanner(System.in);

       int n1=1000;
       int n2=2000;
       int n3=3001;

       int largest=0;
       
       if (n1>n2 && n1>n3) {
    	   largest=n1;
    	   
       } else if (n2>n1 && n2>n3)  {
    	largest=n2;
    	
       }else if (n3>n1 && n3>n2) {
    	   largest=n3;
       }   
    	 System.out.println(largest+" is largest number");
    	   
     if (largest%2==0)  {
    		 System.out.println(largest+" is even number");
     } else {
    		 System.out.println(largest+" is odd number");
    		 
    	 }
    	   
    	   
    	   }
       }








		
		
		
		
		
		
		
	


