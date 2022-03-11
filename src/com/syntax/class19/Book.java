package com.syntax.class19;

public class Book {
//Write Book class that will have instance variables and 2 Constructors.
//While creating an object make sure:
//Instance variables are being initialized
//Both Constructors are being executed
	String bookName="The Alchemist:";
	String bookAuthor="Paulo Coelho,";
	int bookPrice=54;
	int bookNumberOfPages=186;

	
	Book(String bookName,String bookAuthor,int bookPrice,int bookNumberOfPages ){
		this.bookName=bookName;
		this.bookAuthor=bookAuthor;
		this.bookPrice=bookPrice;
		this.bookNumberOfPages=bookNumberOfPages;
	}
	Book(){
		
	}
	void printBook() {
	System.out.println(bookName+" "+bookAuthor+ "$"+bookPrice);	
	System.out.println(this.bookNumberOfPages);	
	}
	
	
	
	
	
	
	public static void main(String[] args) {

	}

}
