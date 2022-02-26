package com.syntax.class13;

public class Task4 { 
    //Create a method createEmail(). 
	//Based on values of users name, lastName and email type, your method should return complete email Address.
	//Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com or 
	
	String createEmail(String userName,String lastName,String emailType) {
		return userName+lastName+"@"+emailType;
	}

	public static void main(String[] args) {
		
		Task4 email=new Task4();
		System.out.println(email.createEmail("john", "snow", "gmail.com or"));

	}

}
