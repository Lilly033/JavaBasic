package com.syntax.class18;

public class AccessModifierTester {

	public static void main(String[] args) {

		
		AccessModifiers  am=new AccessModifiers ()	;
	//	System.out.println(am.name); cant access as name is private access
		System.out.println(am.age);
		System.out.println(am.weight);
		System.out.println(am.color);
	}

}
