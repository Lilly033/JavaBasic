package com.syntax.class19;   //CONSTRUCTOR

public class Horse {
	//it is very good pructice to make the fields private
	private String name;
	private int age;
	private double weight;
	Horse(String horseName,int horseAge,double horseWeight){
		name=horseName;
		age=horseAge;
		weight=horseWeight;
		
		//Purpose of constructor is to give initial value to the fields of class
		//Name of constructer should be same as class name
	}
	void printHorseName() {
		System.out.println("Name "+ name);
	}
void setName(String horseName) {
	name=horseName;
}
	public static void main(String[] args) {
		

	}

}
