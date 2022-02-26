package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {

		int num1;
		
		//creating an Arrey that hold 4 elements
		
		int[]numbers=new int[4];
		
		//storing values/elements inside an Array
		numbers[0]=90;
		numbers[1]=87;
		numbers[2]=89;
		numbers[3]=99;
		
		//print 99
		System.out.println(numbers[3]);
		System.out.println(numbers[3]+ numbers[0]); // preform addition 189
		
		//i want to create an array of countries
		String[] countries=new String[5];
		 countries[0]="Usa";
		 countries[1]="Canada";
		 countries[2]="Afganistan";
		 countries[3]="Moldova";
		 countries[4]="Morocco";
		 //countries[5]="Turkey"; ArrayindexOutOfBoundsExseption
		 System.out.println( countries[3]+ " " +countries[2]);
		System.out.println("---------------------");
		
		 String[] names=new String[5];
		 names[1]="Orsan";
		 names[2]="Lilly";
		 names[3]="Zak";
		 System.out.println(names[1]);
		 System.out.println("Value in index 4 is = " +names[4]);
		 names[1]="Daniel";
		 System.out.println(names[1]);
		
		//Create an arrey to store 4 diferent prices
		 //and then finde an avarage of how much we spent
		 
		 double[] price=new double[4];
		 price[0]=1.99;
		 price[1]=2.99;
		 price[2]=3.99;
		 price[3]=4;    // casting will happend
		 
		double avg=((price[0]+price[1]+price[2]+price[3])/4);
		System.out.println(avg);
		
	}

}
