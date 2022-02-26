package com.syntax.class12;

public class Dog2 {

	String name;
	String bread;
	String color;
	void burk() {
		System.out.println(name+ " can bark");
	}
	void jump() {
		System.out.println(name+" cane jump");
	}
	void love() {
		System.out.println(name +" love his owner");
	}
	void printComleteInfo() {
		System.out.println(name+ " can bark and jump and love his owner");
	}
	public static void main(String[] args) {
      
		Dog2 bread = new Dog2();
		
		bread.name="Husky";
		bread.printComleteInfo();
		bread.name="Bulldog";
		bread.printComleteInfo();
		bread.name="Labrador";
		bread.printComleteInfo();
	}

}
