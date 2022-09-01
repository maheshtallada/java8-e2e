package com.learning.java8.java8e2e.newFeatures;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Filter {

	public static void main(String[] args) {

		List<String> projects = Arrays.asList("cid", "eVestment", "adient", 
				"apll", "kroger", "singpost");
		System.out.println(projects);
		
		List<String> collect = projects.stream()
				// introducing predicate
				.filter(pd -> (pd.length() >= 5))
				.collect(Collectors.toList());
		System.out.println(collect);
		
		
		// Predicate internals
		Predicate<String> pct = t -> t.startsWith("a");
		boolean test = pct.test("adient");
		System.out.println(test);

	}

}
