package com.syntax.class13;

public class Task3 {
	//Create a method that will say Hello in different language
	//based on the country that will passed when method is executed.
	
   String sayHello(String country) {
	   
	 switch (country){
	 
	 case "Serbia":
	 return "Cao";
	 
	 case "Italy":
	 return "Ciao";
	
	 case  "Mexico":
	 return "Hola";
	
	 case "USA":
	 return "Hello";
	
	 default:
		return "Uknown";
	 }
 }
	public static void main(String[] args) {
		Task3 obj=new Task3();
		System.out.println(obj.sayHello("Mexico"));
     // String country=obj.sayHello("Mexico");
		//System.out.println(country);          WE CAN DO THIS WAY TOO!!!!!
	}

}
