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
		
		
		// java8 -- find occurences of chars in a word
		Map<Character, Long> freqMap = freq.chars()
			.mapToObj(c -> (char) c)
			// here we are grouping by two items
			// 1. Function.identity() -- each char of the word we are passing
			// 2. Collectors.counting() -- this is to count
			.collect(Collectors.groupingBy(
					Function.identity(), Collectors.counting()
					));
		System.out.println(freqMap);
		
		
		// find occurences of words in sentence
		String sentence = "java is robust java is rigid java is ultimate";
		
		Stream.of(sentence.split(" "))
			.collect(Collectors.groupingBy(
					Function.identity(), Collectors.counting()))
			.entrySet()
			.forEach(System.out::println);
		// remove Collectors.counting() and check what happens
	}

}
