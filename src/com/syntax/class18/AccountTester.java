package com.syntax.class18;

public class AccountTester {

	public static void main(String[] args) {

		Account account=new Account(); 
	//	System.out.println(account.userName);
	//	System.out.println(account.password);
	//	System.out.println(account.balance);
		System.out.println(account.accountNumber);
		
		//  accessing a field directly is diferent from accessing the same field
		//with methods having different access modifier
	//		account.printuserName();
			account.printpassword();
			account.printBalance();
			account.printAccountNumber();
				
			
		
	}

}
