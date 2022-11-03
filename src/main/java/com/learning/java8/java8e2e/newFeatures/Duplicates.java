package com.learning.java8.java8e2e.newFeatures;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicates {

	public static void main(String[] args) {

		// duplicates in a list 
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> set = new HashSet<>();
        
        myList.stream()
        	.filter(n -> !set.add(n))
        	.forEach(System.out::println);
        
        
        // duplicate chars in a string
        String str = "MaheshMahi";
        Set<Character> charSet = new HashSet<>();
        str.chars()
        	.mapToObj(ch -> (char) ch)
        	.filter(chr -> !charSet.add(chr))
        	.collect(Collectors.toSet())
        	.forEach(System.out::println);
	}

}
