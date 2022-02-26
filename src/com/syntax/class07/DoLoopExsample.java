package com.syntax.class07;

import java.util.Scanner;

public class DoLoopExsample {

	public static void main(String[] args) {
		
		
/*  create a secret number
 * we want to user to guess our secret number
 * The moment user guessed my secret number----my program should stop 
 * otherwise it should continue asking to guess my namber
 */
		
	int secretNumber=12;
	Scanner scan=new Scanner (System.in);
	int guessNumber;
	
	do {
		System.out.println("Please enter the number to win");
		guessNumber=scan.nextInt();
		
	}while(guessNumber!=secretNumber);
		
		System.out.println("Congrats");
		
		
	}

}
