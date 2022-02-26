package com.syntax.class12;

import java.util.Scanner;

public class Dog {
	
	//attributes,fields,properties
	
	String name;
	String color;
	String breed;
	char gender;
	int age;
	double weight;
	//Behaviors,functions and methods
	
	void bark() {
		System.out.println("Dog is barking...");
	}
	void eat() {
		System.out.println("Dog is eating");
	}
	void sleep() {
		System.out.println("Dog is sleeping");
		
	}

	public static void main(String[] args) {
		Dog scooby =new Dog();  //object creation  scooby from the class Dog
		//Dog is a class
		//scooby is an object
		// = is an assigment operator
		//new is keyword that we use to create the object of class
		//Dog() we are caling the constructor of the class
		//Scanner scan=new Scanner(System.in); //"" inport just like scanner""
		//scan.nextInt();
		
       scooby.bark();
       scooby.eat();
       scooby.sleep();
	}

}
