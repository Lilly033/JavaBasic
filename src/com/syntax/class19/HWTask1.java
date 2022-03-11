package com.syntax.class19;

public class HWTask1 {
//	 Write a java class that have 4 constructors with 4 different access levels
	//of constructors(private,public,default,protected) 
	//and create 4 objects of this class:
	//1 - inside same class; 2 - from outside the class;
	//3 - from different class inside different package  and observe result.
	
	private HWTask1() {
		System.out.println("private");
	}
	 HWTask1(double a) {
		System.out.println("defoult");
	}
	protected HWTask1(String a) {
		System.out.println("protected");
	}
	public HWTask1(boolean a) {
		System.out.println("public");
	}
	
	public static void main(String[] args) {

	//	new HWTask1();
		new HWTask1("HAHA");
		new HWTask1(10.7);
		new HWTask1(false);
		
	}

}
