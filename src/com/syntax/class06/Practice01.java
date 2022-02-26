package com.syntax.class06;

public class Practice01 {

	public static void main(String[] args) {

		int day=7;
		String dayName;               
		
		if(day==1) {
		   dayName="Monday";
		}else if(day==2) {
			dayName="Tuesday";
		}else if(day==3) {
			dayName="Wednesday";
		}else if(day==4) {
			dayName="Thursday";
		}else if(day==5) {
			dayName="Friday";
		}else if(day==6) {
			dayName="Saturday";
		}else if(day==7) {
			dayName="Sunday";
		}else {
			dayName="Invalid day";
		}
		
		
		System.out.println(dayName);
		System.out.println("----------------------------------------");
		
		switch (day) {
		case 1:                                        //switch will work on String,byte,short,int,char
			dayName="Monday";
			break;                               //     but will not with boolean,float,long,double
		case 2:
			dayName="Tuesday";                 //    switch case cannot be used with Relational or Logical
			break;                            //           operators !!!!!for exsample//
			
		case 3:                                 //         int num1=10;
			dayName="Wednesday";                 //        switch(num1){
			break;                             //         case num1>=10:
		case 4:                            //        case num1>=10 && num1<=100
			dayName="Thursday";
			break;
		case 5:
			dayName="Friday";
			break;
		case 6:
			dayName="Saturday";
			break;
		case 7:
			dayName="Sunday";
			break;
			default:   // you can put brake but also u dont have to!after the default!
			dayName="Invalid";
			
		}
		
		System.out.println(dayName);
	}

}
