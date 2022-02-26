package com.syntax.class07;

public class DoWhileLoop {

	public static void main(String[] args) {

		
		int num=1;
		while(num<=3) {   // IS MORE USED THAN DO WHILE
			System.out.println("Hello");  //WHILE CHEKS CONDITION BEFORE EXECUTION
			num++;
		}
		System.out.println("***************  DO WHILE CHEKS CONDITION AFTER EXECUTION  ****************");
		int num1=10;
		do {                       //IS LESS USED THAN WHILE
			System.out.println("Hello");
			num1++;
		}while(num1<=3);
		
		System.out.println("I WANT TO PRINT NUMBERS FROM 1 TO 30 USING DO WHILE LOOP");
		
		int num3=1;
		do { 
			System.out.print(num3+" ");
			num3++;
		}while (num3<=30);
		
		
		
		
	}

}
