package com.syntax.class16;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="123456!#$#%#&ashfjjghgJFKTDTD";
		System.out.println(str.replaceAll("[0-9]", ""));
		System.out.println(str.replaceAll("[a-z]", ""));
		System.out.println(str.replaceAll("[A-Z]", ""));
		System.out.println(str.replaceAll("[!-/]", "")); //special caracers removed
		System.out.println(str.replaceAll("[A-z]", "")); //all capital and lower case letters
		System.out.println(str.replaceAll("#", "0"));
		System.out.println(str.replaceAll("[A-Za-z0-9]", ""));
		System.out.println(str.replaceAll("[^A-Za-z0-9]", "")); // (^je not)replace special caraters
	}

}
