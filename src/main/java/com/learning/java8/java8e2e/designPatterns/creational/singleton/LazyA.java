package com.learning.java8.java8e2e.designPatterns.creational.singleton;

public class LazyA {
	
	/*
	 * Create a class with static member which is the LazyA. 
	 * Just declare, don't assign an instance with new operator.
	 * add private no args constructor
	 * add static method, as below
	 * 
	 * 
	 * remember this as just addition of null check, 
	 *  synchronized block is to handle multi-threaded environment.
	 * */
	
	private static LazyA lazyA;
	
	private LazyA () {}
	
	// In single checking, we can just add synchronized keyword in method signature
	// The below is Double checking -- i.e., adding synchronized block
	
	
	// as we know, synchronized bloack allows only one thread at a time, 
	//there won't be any issue with multiple threads
	public static LazyA getLazyA() {
		if (lazyA == null) {
			synchronized (LazyA.class) {
				if (lazyA == null) {
					lazyA = new LazyA();// instance will be created at request time
				}
			}
		}
		return lazyA;
	}
	
	public void showMessage() {
		System.out.println("This is a singleton class demo called through lazy Instantiation");
	}

}
