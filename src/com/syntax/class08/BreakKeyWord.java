
package com.syntax.class08;

public class BreakKeyWord {

	public static void main(String[] args) {

		for(int i=1; i<5; i++) {
			System.out.println("I am code inside for loop");
			if(i==3) {
				break;
			}
			//break; dos not make sence!!!! only when you meet your condition then it does!!!
		}
		System.out.println("End of the code");
		
		boolean winter=true;
		int temp=0;
		while(winter) {
			System.out.println("Its coold");
			if(temp==20) {
			
			break;
		}
			temp+=5;
		}
		
	}

}
