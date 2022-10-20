package com.learning.java8.java8e2e.newFeatures;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct {
	
	// usage of  java.util.stream.Stream.distinct();

	public static void main(String[] args) {
		
		List<String> numbers = Arrays.asList("One","One","One","Two","Two","Two","Three","Four","Three");
		
		List<String> distinctNumbes = numbers.stream().distinct().collect(Collectors.toList());
		distinctNumbes.stream().forEach(System.out::println);
		
		

	}

}
