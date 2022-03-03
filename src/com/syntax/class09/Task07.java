package com.syntax.class09;

public class Task07 {

	public static void main(String[] args) {
/*Create an array on integers and calculate the sum of all elements in an array
 */
		
	int[]elements= {1,2,3,4,5};
	int sum=0;	
	for(int i=0;i<elements.length;i++)	{
	System.out.println(i);
	sum+=elements[i];
	System.out.println("The sum of all elements in an arrey is "+sum);
	}
	
		int sum1=0;
		for(int n:elements) {
		sum1+=n;
		System.out.print(sum1+" ");
		}
		
		
		
	}

}
