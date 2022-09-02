package com.learning.java8.java8e2e.designPatterns.creational.singleton;

public class EagerA {
	
	/*
	 * Create a class with static member which is the object, assign it with a new instance ();
	 * add private no args constructor
	 * add static method, which returns the above static variable.
	 * */
	
	private static EagerA eagerA = new EagerA();
	
	private EagerA () {}
	
	public static EagerA getEagerA( ) {
		return eagerA;
	}
	
	public void showMessage() {
		System.out.println("This is a singleton class demo called through eager Instantiation");
	}

}
