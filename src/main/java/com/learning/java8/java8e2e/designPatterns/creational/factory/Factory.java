package com.learning.java8.java8e2e.designPatterns.creational.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factory {
	/* 
	 * 1. PlanFactory, as name indicates provides/returns the 
	 * 		respective type of plan object for the key provided i.e., plan type
	 * 2. need to have those many plan type classes and 
	 * 		extend it to the Abstract Plan class. 
	 * 		his abstract class contain some common method 
	 * 3. Driver class, here Factory calls the factory class' method and gets the
	 * 		desired instance by passing the plan type && 
	 * 		calls the common method in abs class
	 * */

	public static void main(String[] args) throws IOException {

		PlanFactory planFactory = new PlanFactory();

		System.out.print("Enter the name of plan for which the bill will be generated: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String planName = br.readLine();
		System.out.print("Enter the number of units for bill will be calculated: ");
		int units = Integer.parseInt(br.readLine());

		Plan p = planFactory.getPlan(planName);
		// call getRate() method and calculateBill()method of DomesticPaln.

		System.out.print("Bill amount for " + planName + " of  " + units + " units is: ");
		p.getRate();
		p.calculateBill(units);
	}

}
