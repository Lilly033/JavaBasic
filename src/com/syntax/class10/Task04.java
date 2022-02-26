package com.syntax.class10;

public class Task04 {

	public static void main(String[] args) {
  /*Create a 2D array(shorter way) in which first array will consist of 4 names 
   * and second array will contain grades. 
   * Then your program should print name of the students that has A and B grade
   */
		
		String[][]grades= { 
			              {"Lilly","Maha","David","John","Tom"},
			
	                      {"A","B","C","D","E"}
		};
		         System.out.println("Student "+ grades[0][0]+" has a "+ grades[1][0]);
			     System.out.println("Student "+ grades[0][2]+" has a "+ grades[1][2]);
		         System.out.println("Student "+ grades[0][3]+" has a "+ grades[1][3]);
			     System.out.println("Student "+ grades[0][4]+" has a "+ grades[1][4]);
		

		
		
		
		
	}

}
