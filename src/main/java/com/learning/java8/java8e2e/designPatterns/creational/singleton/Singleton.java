package com.learning.java8.java8e2e.designPatterns.creational.singleton;

public class Singleton {
	
	/*There are two forms of singleton design pattern

	Early Instantiation: creation of instance at class load time. -- has performance issues 
															-- if it handles any resources
	Lazy Instantiation: creation of instance when required.
	
	Lazy Inner class instantiation : 
		1. create a static inner class which has static variable as the object reference.
		2. Inner class won't be loaded until the method is called.
	 	3. effificent and thread safe without adding the synchronized block */
	
	// java.lang.runtime is the best example for singleton class 
	// --since runtime is unique, there should be only single implementation of the class

	public static void main(String[] args) {
		
		// Early
		EagerA eagerA = EagerA.getEagerA();
		eagerA.showMessage();
		
		// Lazy
		LazyA.getLazyA().showMessage();
		
		// Lazy inner class
		LazyInnerClass.getInstance().showMessage();

	}

}
