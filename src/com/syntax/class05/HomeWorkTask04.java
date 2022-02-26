package com.syntax.class05;

import java.util.Scanner;

public class HomeWorkTask04 {

	public static void main(String[] args) {
/*Write a program that will ask user to input inputs the current time (use 24 hour format).
Based on the given time define:
if hour is between 1-11 --> Morning
if hour between 12-15 --> Afternoon
if hour between 16-20 --> Evening
if hour between 21-24 --> Night
 */
	Scanner scan=new Scanner(System.in)	;
	
	System.out.println("Please enter the time, using 24 hour format");
	int t=scan.nextInt();
	if (t>0 && t<=11) {
		System.out.println("Morning");}
		else if (t>=12 && t<=15) {
		System.out.println("Afternoon");}
		else if (t>=16 && t<=20) {
		System.out.println("Evening");}
		else if(t>=21 && t<=24) {
		System.out.println("Night");
	}
	
	}}
	
	
		
		
		
		
		
		
		
		
	


