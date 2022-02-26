package com.syntax.class09;

public class Task06 {

	public static void main(String[] args) {
/*Create an array of animals and store 5 elements into it.
 * Using 2 different loops print all elements from the array.
 */
		String[] animal=new String[5];
		animal[0]="Wolf";
		animal[1]="Lion";
		animal[2]="Frog";
		animal[3]="Duck";
		animal[4]="Bear";
		
		for(int i=0;i<animal.length;i++) {
			System.out.print(animal[i]+", ");
		}
		System.out.println();
		for(String pet:animal) {
			System.out.print(pet+", ");
		}
			
		}
		
	}


