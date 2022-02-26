package com.syntax.class10;

public class Task02 {

	public static void main(String[] args) {



	String[] countries= {"Macedonia", "Bulgaria", "Serbia", "Croatia"};

   String capital=null;
   for(int i=0; i<countries.length; i++) {
	
	switch(countries[i]) {
	
	case "Macedonia":
		capital="Skopje";
		break;
	case "Bulgaria":
		capital="Sofia";
		break;
	case "Serbia":
		capital="Belgrade";
		break;
	case "Croatia":
		capital="Zagreb";
		break;
	default:
	}
		System.out.println("The capital of " +countries[i]+" is " + capital);
	
	}
   for(String country:countries) {
	   if(country.equals("Macedonia")) {
		   capital="Skopje";
	   }else if(country.equals("Serbia")){
			   capital="Belgrade";
	   }else if(country.equals("Croatia"))	{   
			   capital="Zagreb";
	   }
  
   
			   System.out.println("The capital of " +country +" is " + capital); 
		  
	   }}}
   
   
   //////////FINISH THIS
   
	

		 
		 
		 
		
	
		
		
		
		
	


