package com.syntax.class17;

import com.syntax.class18.AccessModifiers;

public class AccessModifierTester {

	public static void main(String[] args) {
		
	//cant access name coz private
  //cant access age coz have default access
//cant acces weigth coz protecded access
		// only color can be accessed coz is public
		AccessModifiers  am=new AccessModifiers ()	;
	//	System.out.println(am.name);
	//	System.out.println(am.age);
	//	System.out.println(am.weight);
		System.out.println(am.color);

	}

}
