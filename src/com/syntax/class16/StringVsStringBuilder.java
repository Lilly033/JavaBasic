package com.syntax.class16;

public class StringVsStringBuilder {

	public static void main(String[] args) {

		
		
		String s="Asghar Is Great";
		System.out.println(s.replace(" ", ""));  //imutinability
		System.out.println(s);                    //make change but dont keep them
		
		
		String s1="Asghar Is Great";
		System.out.println(s.concat("hhhaha"));  //imutinability
		System.out.println(s1);                    //make change but dont keep them
		
		
		
		StringBuilder StringBuilder = new StringBuilder("Asghar Is Great");
		System.out.println(StringBuilder.reverse());
		System.out.println(StringBuilder);         // make change and keep them
		
	
	StringBuilder StringBuilder1 = new StringBuilder("Asghar Is Great ");
	System.out.println(StringBuilder1.append("hahhaah"));
	System.out.println(StringBuilder1);           //to attach hahah.append
                                // also we can use .concat but not on the string class
	
	
	
	
	
	
	
	
	
	
	
	
}}
