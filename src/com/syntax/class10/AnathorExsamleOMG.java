package com.syntax.class10;

public class AnathorExsamleOMG {

	public static void main(String[] args) {

		String[][] food= {
				{"red bull","burger","steak","fries"},
				{"curry","biriyani","butter chiken"},
				{"noodles","pad thai","tom yam"},
				{"pizza","pasta"}
		};
		
		for( int row=0; row<food.length; row++) {
		for (int col=0; col<food[row].length; col++)	{
			
			System.out.println(food[row][col]);
		}
		}
		System.out.println("   Another way   ");
		
		for (String[] cousine:food) {
			for(String f:cousine) {
				System.out.println(f);
			}
		}
		
	}

}
