package com.syntax.class05;

import java.util.Scanner;

public class HomeWorkTask05 {

	public static void main(String[] args) {

/*
 Write a program that will read three inputs of scores 
 (quiz, mid term, and final scores) and determine the grade based on the following rules: 
if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F
 */
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your scores");
		int s=scan.nextInt();
		if (s>=90) {
		System.out.println("grade A");
		}
	    else if (s>=70 && s<90) 
	    {
	    System.out.println("grade B");
	    }
	    else if(s>=50 && s<70) {
	    System.out.println("grade C");
	    
	    } else if (s<50){
	    System.out.println("grade F");
	    	
		
		
		
		
		
		
		
	}}}


