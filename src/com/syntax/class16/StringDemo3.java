package com.syntax.class16;

import java.util.Arrays;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="This is a sentice";
		String[] strArr=s.split(" ");
		System.out.println(Arrays.toString(strArr));
		System.out.println(strArr.length);
		System.out.println(strArr[0]);
		System.out.println(strArr[3]);
		String s2="This is a sentice. Batch 12 is great. Edward is not great. "
				+ "He is super great";
		
		String[] strArr2=s2.split("[.]");
		System.out.println(strArr2.length);
		System.out.println(strArr2[3]);  //u see there is a space
		System.out.println(strArr2[3].trim());// trim to remove spaces befor and after
	}

}
