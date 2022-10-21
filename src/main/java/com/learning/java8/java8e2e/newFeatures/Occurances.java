package com.learning.java8.java8e2e.newFeatures;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Occurances {

	public static void main(String[] args) {
		
		String freq = "javajava";
		
		// before java8
		Map<Character, Integer> countMap = new HashMap<>();
		for (char c : freq.toCharArray()) {
			if(!countMap.containsKey(c)) {
				countMap.put(c, 1);
			} else {
				countMap.put(c, countMap.get(c)+1);
			}
		}
		System.out.println(countMap);
		
		
		// java8
		Map<Character, Long> freqMap = freq.chars()
			.mapToObj(c -> (char) c)
			.collect(Collectors.groupingBy(Function.identity(), 
					Collectors.counting()));
		System.out.println(freqMap);
	}

}
