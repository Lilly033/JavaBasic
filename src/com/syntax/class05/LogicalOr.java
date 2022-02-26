package com.syntax.class05;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {

		
		String day="Saturday";
		if(day.equals("Saturday") || day.equals("Sunday")){
		System.out.println("I hava Java class")	;
		
		
	}

        System.out.println("Code outside of if statment");
        
        /* lets ask user what is  the day today
         * based on the day lets define wich class we have
         * if (monday or friday) there is no class
         * else if (tuesday or wednesday) --- there is manual testing class
         * else if (thursday) review class today
         * else if (saturday or sunday)  --java class
         * else ivalid day (FUNDAY)
         */
                                                    //to da zavrsis obavezno!!!!!!!
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Wich day is today");
        day=scan.next();
        if (day.equals("Monday")|| day.equals("Friday")) {
        	System.out.println("There is no class");
        }else if (day.equals("Tuesday") || day.equals("Wednesday")){
        System.out.println("There is manual testing class")	;
        }else if (day.equals("Thursday")) {
        	System.out.println("Review class today");
        }else if (day.equals("Saturday") || day.equals("Sunday")){
        	System.out.println("Java class today");
        }else {
        	System.out.println("Inalid Day");
        	
        	
        
        	
        }
        
        
        

}}