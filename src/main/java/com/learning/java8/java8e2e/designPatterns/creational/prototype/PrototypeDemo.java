package com.learning.java8.java8e2e.designPatterns.creational.prototype;


class PrototypeDemo {
	public static void main(String[] args) {

		EmployeeRecord e1 = new EmployeeRecord(5, "Stream", "Java8", 
				20000, "Functional Programming");

		e1.showRecord();
		System.out.println("\n");
		EmployeeRecord e2 = (EmployeeRecord) e1.getClone();
		e2.showRecord();
	}
}