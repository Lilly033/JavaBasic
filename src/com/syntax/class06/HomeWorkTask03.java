package com.syntax.class06;

import java.util.Scanner;

public class HomeWorkTask03 {

	public static void main(String[] args) {

	/*
3. Write a program to ask user to enter value for sale: yes or no
* if there is no sale --> you are not going for shopping
* if there is sale ask you user for the price of the item

* Based on the price you have to calculate the price of the item after the discount

* if price is less than $20 --> apply 10% discount
* if price is between $20 & $100 --> 20% discount
* if price between $100 & $500 --> 30% discount
* otherwise apply 50% discount

Output of the program should be:

After discount ___ the price of the item reduce from __ to ___
            
	 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Is there a sale today?");
		String sale=scan.next();
		
		if (sale.equalsIgnoreCase("Yes")){
		
		System.out.println("What is the price for the item?");
		int price=scan.nextInt();
		double percent=0;
		
		if(price<20) {
			percent=0.1;
		}
		else if(price>20 && price<100) {
			percent=0.2;
		}
		else if(price>100 && price<500) {
			percent=0.3;
		}
		else {
			percent=0.5;
		}	
		double discount=percent*100;
		double finalPrice=price-discount;
		System.out.println("After the " + discount+" % discount, the price of the item reduce from $ " 
		+price +" to $ "+ finalPrice);
		
		}else if(sale.equalsIgnoreCase("No")){
		System.out.println("You are not going to shopping!");
		}
	


}}