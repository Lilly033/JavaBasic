package com.syntax.class12;

public class Phone {
	
	String make;
	String model;
	int price;
	String color;
	double screnSize;
	
	void makeCalls() {
		System.out.println("Making a call");
	}
	void takePictures() {
		System.out.println("Taking pictures");
	}
      void printComliteInfo() {
    	  System.out.println("make "+make);
    	  System.out.println("model "+model);
    	  System.out.println("price "+price);
    	  System.out.println("color "+color);
    	  System.out.println("screnSize "+screnSize);
}          

	public static void main(String[] args) {
		
		Phone iphone=new Phone();
		iphone.make="Aple";
		iphone.model="Iphone 13 ";
		iphone.price=1200;
		iphone.color="Pink";
		iphone.screnSize=6.0;
		
		//iphone.makeCalls();
		//iphone.takePictures();
		
        iphone.printComliteInfo();
		System.out.println();
		Phone samsung=new Phone();
		samsung.make="Samsung";
		samsung.model="T20 ";
		samsung.price=600;
		samsung.color="Black";
		samsung.screnSize=8.0;
		
		samsung.printComliteInfo();
		
		System.out.println();
		
		Phone nokia=new Phone();
		nokia.make="Nokia";
		nokia.model="PH777 ";
		nokia.price=540;
		nokia.color="Silver";
		nokia.screnSize=5.9;
		
		nokia.printComliteInfo();
		
	
	}

}
