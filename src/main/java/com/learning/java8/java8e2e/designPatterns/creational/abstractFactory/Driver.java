package com.learning.java8.java8e2e.designPatterns.creational.abstractFactory;

import java.io.IOException;

public class Driver {
	public static void main(String args[]) throws IOException {
		
		/*
		 * In Factory Design Pattern, we got the instance of the sub-class of 
		 * the abstract class return type.
		 * 
		 * 
		 * But here, we would retrieve the type of factory first
		 * and then the specific subclass of the factory which we retrieved. 
		 */

		AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
		Bank b = bankFactory.getBank("HDFC");
		
		System.out.println("you are taking the loan from "+ b.getBankName());  

		AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
		Loan l = loanFactory.getLoan("Business");
		l.getInterestRate(12);
		l.calculateLoanPayment(2000000, 5);
	}
}