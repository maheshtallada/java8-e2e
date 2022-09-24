package com.learning.java8.java8e2e.designPatterns.creational.singleton;

public class LazyInnerClass {
	
	private LazyInnerClass () {}
	
	private static class SingletonHelper {
		private static final LazyInnerClass instance = new LazyInnerClass();
	}
	
	public static LazyInnerClass getInstance() {
		return SingletonHelper.instance;
	}
	
	public void showMessage() {
		System.out.println("This is a singleton class demo called through lazy inner class Instantiation");
	}

}
