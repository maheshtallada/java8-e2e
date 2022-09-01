package com.learning.java8.java8e2e.newFeatures;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
	
	/*
	 * Map takes a stream and returns another stream
	 * It's called Data Transformation :: One-One mapping
	 * 
	 * 
	 * FlatMap takes Stream<Stream<T>> and returns Stream<R>
	 * It extends Map in performing map+flattering :: One-Many mapping
	 */

	public static void main(String[] args) {
		
		List<Car> carsList = Arrays.asList(
				new Car("Ford", 2021, Arrays.asList("Mahesh", "Manjit")),
				new Car("Toyota", 2017, Arrays.asList("Deepti", "Navya")));
		System.out.println(carsList);
		
		
		// Map Demo - to extract stream of brands from carsList stream
		List<String> brands = carsList.stream().map(car -> car.getBrand())
							.collect(Collectors.toList());
		System.out.println(brands);
		
		
		
		
		// FlatMap intro
		// through map, we can only fetch the List<List<String>> of customers
		List<List<String>> customers = carsList.stream()
					.map(car -> car.getCustomers()).collect(Collectors.toList());
		System.out.println(customers);
		
		
		
		
		// FlatMap made it possible to extract stream from stream of stream data
		// just we need to pass "car.getCustomers().stream()" to flatMap
		List<String> customerList = carsList.stream()
					.flatMap(car -> car.getCustomers().stream())
					.collect(Collectors.toList());
		System.out.println(customerList);

	}

}
