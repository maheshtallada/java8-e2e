package com.learning.java8.java8e2e.designPatterns.creational.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

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

	public static void main(String[] args) throws CloneNotSupportedException, 
		InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, 
		FileNotFoundException, IOException, ClassNotFoundException {
		/*
		 * CloneNotSupportedException is added while trying to clone the object using clone method
		 * 
		 * InstantiationException, IllegalAccessException, IllegalArgumentException and InvocationTargetException
		 * are added while trying to create instance using reflection API 
		 * 
		 * FileNotFoundException and IOException, ClassNotFoundException
		 * are added while trying to deserialize the initial instance.
		 */
		
		
		
		
		
		// Early
		EagerA eagerA = EagerA.getEagerA();
		eagerA.showMessage();
		
		// Lazy
		LazyA.getLazyA().showMessage();
		
		// Lazy inner class
		LazyInnerClass.getInstance().showMessage();
		
		
		
		PreventReflection pr = PreventReflection.getInstance();
		System.out.println(pr.hashCode());
		
		// break singleton using clone
		
		// *************************************(UN)COMMENT THIS FOR CLONING OBJECT **************************//
		/*PreventReflection pr2 = (PreventReflection) pr.clone();
		System.out.println(pr2.hashCode());
		// prevented this break by overriding clone method and returning CloneNotSupportedException.
		*/
		
		
		
		
		
		// break using Reflection -- for time being comment out "break singleton using clone"
		/* Reflection API - Java Reflection is a process of examining or modifying 
		   the run time behavior of a class at run time */
		
		// *******************(UN)COMMENT THIS FOR CREATING OBJECT USING REFLECTION**************************//
		/*PreventReflection reflectionInstance = null;
		
		Constructor<?>[] declaredConstructors = PreventReflection.class.getDeclaredConstructors();
		for (Constructor<?> constructor : declaredConstructors) {
			constructor.setAccessible(true);
			reflectionInstance = (PreventReflection) constructor.newInstance();
		}
		System.out.println(reflectionInstance.hashCode());
		// prevented this by adding a condition in private constructor, if instance is created, throw exception. */
		
		
		
		
		
		
		// break using de-serialization. prerequisite: class must implement Serializable
		
		// *******************(UN)COMMENT THIS FOR CREATING OBJECT USING DE-SERIALIZATION**************************//
		/* // Serialize singleton object to a file.
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
		out.writeObject(pr);
		out.close();

		// Deserialize singleton object from the file
		ObjectInput in = new ObjectInputStream(new FileInputStream("singleton.ser"));
		PreventReflection instance2 = (PreventReflection) in.readObject();
		in.close();

		System.out.println("instance2 hashCode: " + instance2.hashCode()); */

	}

}
