package com.syntax.class13;

public class MethodDemo4 {
	
	//create a method that takes a boolean isSaleOn double price double discount
	// if isSaleOn=true return discounted price other wise return original price
	
	double checkDiscount(boolean isSaleOn, double originalPrice, double discount) {
		if(isSaleOn) {
			return (originalPrice-originalPrice* discount);
		}else {
			return originalPrice;
		}
	}
    void methodWithOutParamters() {  /// we can do this withaout parametars
	
}
	public static void main(String[] args) {
		
		MethodDemo4 obj=new MethodDemo4();
		System.out.println(obj.checkDiscount(false, 100,.15));
		System.out.println(obj.checkDiscount(true, 100,.15));
	}

}
