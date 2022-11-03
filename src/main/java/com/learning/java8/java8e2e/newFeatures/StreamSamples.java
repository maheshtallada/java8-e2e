package com.learning.java8.java8e2e.newFeatures;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamSamples {

	public static void main(String[] args) {

		//find out all the numbers starting with 1
		
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,15,32);
        myList.stream()
              .map(s -> s + "") // Convert integer to String
              .filter(s -> s.startsWith("1"))
              .forEach(System.out::println);
        
        
        //find the first element
        myList.stream()
        .findFirst()
        .ifPresent(System.out::println);
        
        
        //find the total number of elements present
        long count =  myList.stream()
                .count();
        System.out.println(count);    
        
        
        //max
        int max =  myList.stream()
                .max(Integer::compare)
                .get();
        System.out.println(max);
        

        //find the first non-repeated character
        String input = "Java Hungry Blog Alive is Awesome";

        Character result = input.chars() // IntStream       
        		// First convert to Character object and then to lowercase       
                                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) 
                                .collect(Collectors.groupingBy(
                                		Function.identity(), 
                                		LinkedHashMap::new, 
                                		Collectors.counting()
                                		)) //Store the chars in map with count 
             //.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
             // use the uncommented collect method and check differences
                                .entrySet()
                                .stream()
                                .filter(ent -> ent.getValue() == 1L)
                                .map(entry -> entry.getKey())
                                .findFirst()
                                .get();
        System.out.println("first non-repeated character " + result);
        
        
        //find the first repeated character
        Character res = input.chars() // IntStream      
        		// First convert to Character object and then to lowercase         
                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) 
                .collect(Collectors.groupingBy(
                		Function.identity(), 
                		LinkedHashMap::new, 
                		Collectors.counting()
                		)) //Store the chars in map with count 
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1L)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        System.out.println(res);   
        
	}

}
