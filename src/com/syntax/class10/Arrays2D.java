package com.syntax.class10;

public class Arrays2D {

	public static void main(String[] args) {

		int [][]numbers=new int[3][4];
		
		//1 row or 1 array
		numbers[0][0]=10;
		numbers[0][1]=20;
		numbers[0][2]=30;
		numbers[0][3]=40;
		
		//2 row or second array
		numbers[1][0]=100;
		numbers[1][1]=200;
		numbers[1][2]=300;
		numbers[1][3]=400;
		
		////3 row or 3 array
		numbers[2][0]=1000;
		numbers[2][1]=2000;
		numbers[2][2]=3000;
		numbers[2][3]=4000;
		
		System.out.println(numbers[1][2]);
		System.out.println(numbers[0][1]+ numbers[1][0]);
		
		
		//////ANATHER WAY WAY WAY ANOTHER//////
		
		int [][] number= {  {10,20,30,40},  //0
				         { 100,200,300,400},   //1
				         {1000,2000,3000,4000}  //2
		};
		
		System.out.println(numbers[2][1]);  //2000
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
