package com.syntax.class17;

public class HealtyDog {

// when the information is expected to be different from object to object
	//we store that information in an instance variable
		
		String name;  //instance
		String color;  //instance
		
		// if we know that a value will stay the same for all the objects of a class 
		//we create a static variable for that 
		
	static	int numberOflegs;  //static
		
		void eat() {
		int noOfTimes=3;   //local
		System.out.println(name+ " eats "+ noOfTimes);
		
		}
		void sleep() {
//	System.out.println(name+"Sleeping"+ noOfTimes); cant reach 
		}
	public static void main(String[] args) {
		
		HealtyDog dog=new HealtyDog();   //local
		
		dog.name="scooby";
		dog.color="Pink";
		HealtyDog.numberOflegs=4;
		dog.eat();
		
		HealtyDog dog2=new HealtyDog();
		dog2.name="tomy";
		dog2.color="Navy blue";
		HealtyDog.numberOflegs=6;
		dog2.eat();
		System.out.println(HealtyDog.numberOflegs);
		
		
	}

}
