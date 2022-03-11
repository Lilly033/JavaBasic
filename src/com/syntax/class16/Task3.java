package com.syntax.class16;

public class Task3 {

	public static void main(String[] args) {
//You have a String a=”Is it saturday? 
//Is it raining? Do we have a Java Class today?” 
//How would you find out how many sentences are in that String?
		
	String s="Is it saturday? Is it raining? Do we have a Java Class today?";
			
	System.out.println(s.length());//(this is a method)string class method 
	                                 // to count the number of characters
	                                 //	in a clas
	System.out.println(s.split("[?]").length); //(this is a proporty)length proporty 
	                                             //that we can use to check
		                                         //the number of elements in a array
		
	}

}
