package com.syntax.class09;

public class Task01 {

	public static void main(String[] args) {
	
		/*Create an array of chars and store grades into it: A,B,C,D,E,F.
		 * Then print a grade B (use 2 different ways of creating an array).
		 */
		
		
	
		//another way//
		char[] grade= {'A','B','C','D'};
		//how many elements inside array?
		int size =grade.length;
		System.out.println("Numbers of elements is = "+size);
		
		//System.out.println(grade[1]);
		//System.out.println(grade[2]);
		//System.out.println(grade[3]);
		
		for(int i=0; i<grade.length;i++) {
			System.out.print(grade[i]+" ");
		}
		
	}

}
