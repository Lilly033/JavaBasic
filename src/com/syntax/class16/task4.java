package com.syntax.class16;

public class task4 {

	public static void main(String[] args) {
// How would you reverse a String word by word? for example
		// input=>This is sentence i want to reverse
		// output=>sihT si ecnetnes i tnaw ot esrever
		
	// 	from bilder to string back
		
		String s="This is sentence i want to reverse";
	task4 task4=new task4();
//	System.out.println(task4.reverseString(s));
	String [] strArray=s.split(" ");
//	System.out.println(strArray[0]);  just to check
	for(int i=0;i<strArray.length;i++) {
	//	strArray[i]=task4.reverseString(strArray[i]);  or we can do this or syso
		System.out.print(task4.reverseString(strArray[i])+" ");
	}
	
	}
	
	String reverseString(String inputString) {
		StringBuilder stringBuilder=new StringBuilder(inputString);    //method to revers the 
		stringBuilder.reverse();
		return stringBuilder.toString();                                   //STRING
	
	}
		
	}
	


