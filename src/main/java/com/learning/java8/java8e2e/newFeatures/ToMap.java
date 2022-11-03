package com.learning.java8.java8e2e.newFeatures;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ToMap {

	public static void main(String[] args) {
		
		List<String> students = List.of("tinku", "pinku", "munna", "golu", "chotu");
		students.stream()
			.collect(Collectors.toMap(
						stu -> stu.substring(0, 2), Function.identity()))
			// this produces HashMap -- can take into a variable and check by using <var>.class
			// HashMap wouldn't preserve the order
			.entrySet()
			.forEach(System.out::println);

		
		
		
		// clashing keys
		// if we do not provide the third argument, we would get IllegalStateException when there are duplicate keys
		Map<String, String> collect = students.stream()
			.collect(Collectors.toMap(
						stu -> stu.substring(0, 2), Function.identity(), (a,b) -> a));
		// the third parameters is to specify if there are clashing keys, just return the first one
		
		// or else we can throw an exception
		//.collect(Collectors.toMap(stu -> stu.substring(0, 2), Function.identity(), {throw new Exception("exception message")}));
		System.out.println(collect.getClass());
		
		
		
		// to specify type of map required to preserve the insertion order.
		Map<String, String> collectLinkedHash = students.stream()
				.collect(Collectors.toMap(
							stu -> stu.substring(0, 2), Function.identity(), (a,b) -> a, LinkedHashMap::new));
		System.out.println(collectLinkedHash.getClass());
		
		
	}

}