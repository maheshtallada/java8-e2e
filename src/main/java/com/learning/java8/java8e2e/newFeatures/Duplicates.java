package com.learning.java8.java8e2e.newFeatures;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicates {

	public static void main(String[] args) {
		
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> set = new HashSet<>();
        
        myList.stream()
        	.filter(n -> !set.add(n))
        	.forEach(System.out::println);
	}

}
