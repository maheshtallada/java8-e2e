package com.learning.java8.java8e2e.newFeatures;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce {
	
	// Map is to transform one stream to another
	
	// Reduce is to aggregate a stream into single entity. Sum/max/min/count, etc

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(3,5,7,8,2,5,1);
		
		// reduce stream to sum -- identity & accumulator
		Integer sum = numbers.stream().reduce(0, (a,b)-> a+b);
		System.out.println(sum);
		
		
		
		// reduce stream to sum -- only accumulator -- return Optional
		Optional<Integer> sumOptional = numbers.stream().reduce((a,b)-> a+b);
		System.out.println(
				sumOptional.isPresent()?sumOptional.get():"sumOptional is null");
		
		
		
		// reduce using method reference
		Optional<Integer> sumMethodReference = numbers.stream().reduce(Integer::sum);
		System.out.println(
				sumMethodReference.isPresent()?sumMethodReference
						.get():"sumOptional is null");
		
		
		
		// reduce stream to sum -- only accumulator -- return Optional
		Optional<Integer> maxOptional = numbers.stream().reduce((a,b)-> a>b?a:b);
		System.out.println(
				maxOptional.isPresent()?maxOptional.get():"maxOptional is null");
		
		
		
		// find the largest string in the list
		List<String> names = Arrays.asList("Palvancha", "Khammam", "Bhadrachalam",
				"Warangal", "Hyderabad", "Vijayawada", "Mysore", "Chikmagulur");
		
		Optional<String> largest = 
				names.stream().reduce((a,b) -> a.length()>b.length()?a:b);
		System.out.println(largest.get());

	}

}
