package com.syntax.class16;

public class task5 {

	public static void main(String[] args) {
//How would you check if String is palindrome or not? aba=> true
		//Abbc =>false
		task5 task=new task5();
		System.out.println(task.isPalindrome( "aba"));
		System.out.println(task.isPalindrome("Abbc"));
		
	}
	boolean isPalindrome(String inputStr) {
		String reverseStr=reverseString(inputStr);   //reversing a word
		return reverseStr.equals(inputStr);          //cheking if word are same
		
		
	}
	String reverseString(String inputString) {
		StringBuilder stringBuilder=new StringBuilder(inputString);    
		stringBuilder.reverse();
		return stringBuilder.toString();                                  
	
	}

}
