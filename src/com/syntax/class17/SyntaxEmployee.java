package com.syntax.class17;

public class SyntaxEmployee {
	
	String empId;
	double salary;
	static String CEO="Sumair";
	

	public static void main(String[] args) {

		SyntaxEmployee aselObject=new SyntaxEmployee();
		aselObject.empId="123";
		aselObject.salary=20000;
		System.out.println(aselObject.empId);
		System.out.println(aselObject.salary);
		System.out.println(SyntaxEmployee.CEO);
		
		System.out.println();
		
		SyntaxEmployee mozzamObject =new SyntaxEmployee();
		mozzamObject.empId="1456";
		mozzamObject.salary=243536;
		System.out.println(mozzamObject.empId);
		System.out.println(mozzamObject.salary);
		System.out.println(SyntaxEmployee.CEO);
		
		
		
		
		
		
		
	}

}
