package com.learning.java8.java8e2e.designPatterns.creational.singleton;

public class LazyA {
	
	/*
	 * Create a class with static member which is the LazyA. 
	 * Just declare, don't assign an instance with new operator.
	 * add private no args constructor
	 * add static method, as below
	 * */
	
	private static LazyA lazyA;
	
	private LazyA () {}
	
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
