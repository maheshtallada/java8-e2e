package com.learning.java8.java8e2e.designPatterns.creational.abstractFactory;

abstract class AbstractFactory {
	public abstract Bank getBank(String bank);

	public abstract Loan getLoan(String loan);
}