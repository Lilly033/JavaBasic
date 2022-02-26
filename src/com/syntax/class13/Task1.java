package com.syntax.class13;

public class Task1 {
	//Create a method that will take 2 parameters as a numbers and returns prints which number is larger.
	
	int numbers(int number,int number1) {
		
		if (number>number1) {
			
			return number;
		}
		    return number1;
	}
	
	
	

	public static void main(String[] args) {
		Task1 obj=new Task1 ();
		
		
     System.out.println(obj.numbers(100,80));
	}

} //OVAJ MOZDA NE VALJA!!!!!!!!!!
