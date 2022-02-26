package com.syntax.class12;

public class PhoneTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Phone pixel=new Phone();
   	pixel.make="pixel";
	pixel.model="L09 ";
	pixel.price=200;
	pixel.color="red";
	pixel.screnSize=9.0;
	
	pixel.makeCalls();
	pixel.takePictures();
	
	pixel.printComliteInfo();
	
	Phone samsonite=new Phone();
	samsonite.make="Aple";
	samsonite.model="samsonite 13 ";
	samsonite.price=1200;
	samsonite.color="Pink";
	samsonite.screnSize=6.0;
	
	//samsonite.makeCalls();
	//samsonite.takePictures();
	
    samsonite.printComliteInfo();
	
	
	
	
	
	}
	

}
