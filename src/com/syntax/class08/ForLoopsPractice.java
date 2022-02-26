package com.syntax.class08;

public class ForLoopsPractice {

	public static void main(String[] args) {

		
		
		
		for(int i=1; i<=3; i++) {
				
		System.out.println("Hello "+i);	
		
		}
		System.out.println("       MULTIPLICATION TABLE    ");
		//3*1=3  till
		//3*10=30
		
		int num=3;
		int result;
		for(int i=1; i<=10;i++) {
			result=num*i;
			System.out.println(num+ " X "+i+" = "+ result) ;
		}
		System.out.println("-------------------------");
		for(int i=0; i<=10; i+=3) {
			System.out.println(i+" ");
			System.out.println("_________________________");
			
			int sum=0;
			for(int j=1; j<=5; j++) {
				sum+=j;   //short way of assinging   sum=sum+j;
				
			}
			System.out.println(sum);
				
				
				
			}
					
			
		}
	}


