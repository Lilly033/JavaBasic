package com.syntax.class19;

public class Task2 {
	//Write a java Class Students that have a constructor which takes students name 
	//and 3 subject grades. Inside your class also have a method to Calculate Average Grade.
	//Test Student class for 5 different students with different marks. 
	//Your program should print an average mark of each students name.

	   String name;
	    double subject1;
	    double subject2;
	    double subject3;

	     Task2(String name, double subject1, double subject2, double subject3) {
	        this.name = name;
	        this.subject1 = subject1;
	        this.subject2 = subject2;
	        this.subject3 = subject3;
	    }
	void printAvgGrade(){
	    System.out.println(name+" "+(subject1+subject2+subject3)/3);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
