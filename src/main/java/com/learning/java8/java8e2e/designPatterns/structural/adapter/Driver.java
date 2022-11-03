package com.learning.java8.java8e2e.designPatterns.structural.adapter;

//This is the client class.  
public class Driver {
	
	public static void main(String args[]) {
		
		CreditCard targetInterface = new BankCustomer();
		targetInterface.giveBankDetails();
		System.out.print(targetInterface.getCreditCard());
	}
}