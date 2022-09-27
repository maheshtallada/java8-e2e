package com.learning.java8.java8e2e.explore;

public class StaticPrivateOverride {

	/*
	 * Summary : Both private and static methods with same method signature 
	 * and arguments can exist in child without any compile time issues. 
	 * However this is not overriding.
	 * 
	 * 
	 *  a private method is automatically final and hidden. 
	 *  You are therefore not able to override any private methods
	 */

	public static void main(String[] args) {
		Parent.m1();
		Child.m1();
		
		// we can have m1 in both parent and child, this is not overriding.
		// this is called Method Hiding.
		
		/*
		 * "if a subclass defines a static method with the same signature 
		 * as a static method in the super class, in such a case, 
		 * the method in the subclass hides the one in the superclass." 
		 * The mechanism is known as method hiding
		 */
		
		new Parent().parentTest();
		new Child().childTest();
	}

}

class Parent {
	public static void m1() {
		System.out.println("parent static m1");
	}
	
	private void m2() {
		System.out.println("parent private m2");
	}
	
	public void parentTest() {
		new Parent().m2();
	}
}

class Child {
	
	public static void m1() {
		System.out.println("child static m1");
	}
	
	private void m2() {
		System.out.println("child private m2");
	}
	
	public void childTest() {
		new Child().m2();
	}
	 
}