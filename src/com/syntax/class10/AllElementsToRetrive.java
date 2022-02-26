package com.syntax.class10;

public class AllElementsToRetrive {

	public static void main(String[] args) {

		
		int [][] number= {{10, 20, 30, 40},  //0
				          { 100, 200, 300,},   //1
		                  {1000, 2000}  //2
				         
		};
		// number.length--> gives # of rows
		int size=number.length; // when used wit 2D array gives # of 1D arrays that we stored
		System.out.println(size); //3
		
		int sizeOf1Array=number[0].length;
		System.out.println("Size of the first array= "+sizeOf1Array);//4
		
		int sizeOf2Array=number[1].length;
		System.out.println("Size of the second array= "+sizeOf2Array);
		
		int sizeOf3Array=number[2].length;
		System.out.println("Size of the third array= "+sizeOf3Array);
		
		for(int i=0; i<number.length;i++) {
		for(int j=0; j<number[i].length;j++) {
			System.out.print(number[i][j]+"  ");
			
		}
	}

	}}
