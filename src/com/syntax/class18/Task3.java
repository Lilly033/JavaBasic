package com.syntax.class18;

public class Task3 {
	//Create a method that will accept a String as a parameter 
	//and return a new String that consist only of vowels.
	//Method should be available inside the class only where it was declared 
	//and executed by calling it is name.

	
//	Static methods can access other static methods and fields without needing
	//an object of that class or the class name if they are inside the same class
	
	private  static String onlyVowels(String input) {
	//	String newStr=input.replaceAll("[^aeiouAEIOU]","");
	//	return newStr;
	// we can write bether code like this	
		return input.replaceAll("[^aeiouAEIOU]","");
	}	
	public static void main(String[] args) {
		System.out.println(onlyVowels("Emili"));
	}
		

	}


