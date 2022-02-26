package com.syntax.class06;

import java.util.Scanner;

public class HomeWorkTask01 {

	public static void main(String[] args) {

/*
 * Allow user to enter grade (A, B, or C etc...) 
 * and then provide explanation: A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. 
 * At the end your program should print which grade was entered by a user with explanation.
 */
	Scanner scan=new Scanner(System.in)	;
	System.out.println("Please enter a grade");
	String grade=scan.next();
	switch(grade) {
	
	case "A":
	grade="Excellent";
	break;
	
	case"B":
	grade="Good";
	break;
	
	case"C":
	grade="Average";
	break;
	
	case"D":
	grade="Bad";
	break;
	default:
	grade="Not Accepteble";
	}
	System.out.println(grade);
	}

}
