package com.syntax.class09;

public class Task05 {

	public static void main(String[] args) {
/*Create an array of cars and store 6 elements into it.
 * Using 2 different loops print all values from the array.
 */
		
		String [] cars= {"BMW","Range Rover","Audi","Alfa Romeo","Acura","Bentley"};
		
		for(String car:cars) {
			System.out.print(car+",");
		}		
		System.out.println();
		for(int i=0; i<cars.length;i++) {
			System.out.print(cars[i]+", ");
		}
	}

}
