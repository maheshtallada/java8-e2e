package com.learning.java8.java8e2e.designPatterns.creational.singleton;

public class Singleton {
	
	/*There are two forms of singleton design pattern

	Early Instantiation: creation of instance at load time.
	Lazy Instantiation: creation of instance when required.*/

	public static void main(String[] args) {
		
		// Early
		EagerA eagerA = EagerA.getEagerA();
		eagerA.showMessage();
		
		// Lazy
		LazyA.getLazyA().showMessage();

	}

}
