package com.syntax.class06;

import java.util.Scanner;

public class PracticeSwitchCase02 {

	public static void main(String[] args) {

	Scanner scan=new Scanner(System.in);
	
	System.out.println("Please enter the country"); 
	
	String country=scan.next();
	String language;
	
	switch(country.toLowerCase()) {
	
	case"usa":
		language="english";
	    break;
	case"mexico":
		language="spanish";
		break;
	case "serbia":
		language="serbian";
		break;
	case"russia":
		language="russian";
		break;
	default:
		language="unknown";
	}
		
	System.out.println("You are from " + country + " and speak "+ language+ " language!" );	
		
		
		
		
		
		
		
		
	}

}
