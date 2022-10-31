package com.learning.java8.java8e2e.designPatterns.creational.abstractFactory;

import java.io.IOException;

public class Driver {
	public static void main(String args[]) throws IOException {

		AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
		Bank b = bankFactory.getBank("HDFC");
		
		System.out.println("you are taking the loan from "+ b.getBankName());  

		AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
		Loan l = loanFactory.getLoan("Business");
		l.getInterestRate(12);
		l.calculateLoanPayment(2000000, 5);
	}
}