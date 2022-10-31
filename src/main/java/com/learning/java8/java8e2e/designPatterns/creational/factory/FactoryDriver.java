package com.learning.java8.java8e2e.designPatterns.creational.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactoryDriver {
	/* 
	 * 1. PlanFactory, as name indicates provides/returns the 
	 * 		respective type of plan object for the key provided i.e., plan type
	 * 2. need to have those many plan type classes and 
	 * 		EXTEND them to the ********************ABSTRACT Plan CLASS******************* 
	 * 		this abstract class contain some common method 
	 * 3. Driver class, here FactoryDriver calls the PlanFactory class' method and gets the
	 * 		desired instance by passing the plan type && 
	 * 		calls the common method in abs class
	 * */

	public static void main(String[] args) throws IOException {

		PlanFactory planFactory = new PlanFactory();
//---------------------------------------------just for user input---------------------------------------------
		System.out.print("Enter the name of plan for which the bill will be generated: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String planName = br.readLine();
		System.out.print("Enter the number of units for bill will be calculated: ");
		int units = Integer.parseInt(br.readLine());
//---------------------------------------------just for user input---------------------------------------------
		Plan p = planFactory.getPlan(planName);
		// call getRate() method and calculateBill()method of DomesticPaln.

		System.out.print("Bill amount for " + planName + " of  " + units + " units is: ");
		p.getRate();
		p.calculateBill(units);
	}

}