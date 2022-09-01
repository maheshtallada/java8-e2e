package com.learning.java8.java8e2e.designPatterns.creational.factory;

abstract class Plan {
	protected double rate;

	abstract void getRate();

	public void calculateBill(int units) {
		System.out.println(units * rate);
	}
}

class DomesticPlan extends Plan {
	// @override
	public void getRate() {
		rate = 3.50;
	}
}

class CommercialPlan extends Plan {
	// @override
	public void getRate() {
		rate = 7.50;
	}
}

class InstitutionalPlan extends Plan {
	// @override
	public void getRate() {
		rate = 5.50;
	}
}