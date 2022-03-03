package com.syntax.class18;

public class Account {
	
	private String userName="Lola";
	private String password="Admin";
	public  String accountNumber="123456";
	private double balance=-1500;
	
	private void  printuserName() {
		System.out.println(userName);
	}
	protected void  printpassword() {
		System.out.println(password);
	}
	void printBalance() {
		System.out.println(balance);
	}
	public void printAccountNumber() {
		System.out.println(accountNumber);
	}
	

	public static void main(String[] args) {
		Account account=new Account(); 
		
		System.out.println(account.userName);
		System.out.println(account.password);
		System.out.println(account.balance);
		System.out.println(account.accountNumber);
		
			account.printuserName();
			account.printpassword();
			account.printBalance();
			account.printAccountNumber();
				
			
		
	}}					

	


