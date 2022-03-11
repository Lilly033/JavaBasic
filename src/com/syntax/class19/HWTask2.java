package com.syntax.class19;

public class HWTask2 {
//1.Write program that have static constructor and observe result.
//2.Write a Student class that have instance variables name and address.
//Create a constructor that will initialize those variables. 
//Print name & address of given  student using displayInfo method.
	
	
	//1.static is not alowed
	
	String address;
	String name;
	
	public HWTask2(String name, String address) {
		
		this.name = name;
		this.address = address;
	}

        void displayInfo() {
	System.out.println(this.name+" "+this.address);
}

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
