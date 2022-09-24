package com.learning.java8.java8e2e.designPatterns.creational.singleton;

import java.io.Serializable;

public class PreventReflection extends MyClone implements Serializable{
	/*
	 * Even though, we create a class as Singleton, there are ways we can break it.
	 * 1. How to break using-- clone method, De-serialization and reflection API
	 * 2. How to prevent
	 */
	
	/*
	 * Clone method is present in Object class and modifier is protected., it can't be accessed directly
	 * through our class.
	 */
	
	/*
	 * Usually, this class should be singleton, however as we extended it to a class which implements Cloneable,
	 * this class object can also be cloneable i.e., new instance can be created
	 */
	
	private static PreventReflection preventReflection;

	private PreventReflection() {
		// ********************** to prevent reflection ************************
		if (preventReflection != null) {
			throw new IllegalStateException("Usage of Reflection is restricted.");
		}
	}

	public static synchronized PreventReflection getInstance() {
		if (preventReflection == null) {
			return preventReflection = new PreventReflection();
		}
		return preventReflection;
	}
	

	// ********************** to prevent cloning ************************
	// prevent this breaking by overriding clone method and throwing exception, 
	//usually CloneNotSupportedException
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Usage of Cloning is restricted.");
	}

	// ******** to prevent new instance creation using de-serialization *********
	protected Object readResolve() {
		return preventReflection;
	}
}
