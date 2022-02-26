package com.syntax.class13;

public class MethodsDemo3 {
	
	//int we specify the datatype that method will return
	//squareThe Number name of the method
	//(int number) parametars of the method
	//return tell java what to return from this method
	
	int squareTheNumber(int number) {
		return number * number;
		
	}
	int returneTheSameNumber(int number) {
		return number;
	}
	String getproperAnimalByExspert(String exspertName,String animalName) {
		if("Teyfur".equalsIgnoreCase(exspertName) && "Horse".equalsIgnoreCase(animalName)) {
			return "Camel";
		}else if("Horse".equals(animalName)) {
			return "Horse";
		}else {
			return"I dont know";
		}
	}
	public static void main(String[] args) {

		MethodsDemo3 obj=new MethodsDemo3();
		int result=obj.squareTheNumber(5); //can aslso be returneTheSameNumber depends what u want
		System.out.println(result);
		
		System.out.println(obj.getproperAnimalByExspert("Teyfur", "Horse"));
		System.out.println(obj.getproperAnimalByExspert("Tameer", "Horse"));
		System.out.println(obj.getproperAnimalByExspert("Tameer", "Monky"));
	}

}
