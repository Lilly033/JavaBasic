package com.syntax.class09;

public class ForEachLoop {

	public static void main(String[] args) {
		
		
		
		String[] cities= {"Washigton DC","Miami","Los Angeles","New York"};
		//if you have an arrey you can use for each loop to iterate/loop throught the entire array
		
		for(String city:cities) {
			System.out.println(city+" ");
			
		}
		
		int[] numbers= {10,20,30,40};
		for(int num:numbers) {
			System.out.println(num+" ");
		
		}
		char[] grades= {'A','B','C','D'};
		for(char grade:grades) {
			System.out.println(grade+" ");
		}
	}

}
