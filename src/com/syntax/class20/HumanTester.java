package com.syntax.class20;

public class HumanTester {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student=new Student();
		student.name="Lilly";
		System.out.println(student.name);
        student.printName();
        student.id="123";
        
        System.out.println("***********");
        
        Principle principle=new Principle();
        principle.name="Husan";
		principle.printName();
		principle.parkingSpot=false;
	}

}
