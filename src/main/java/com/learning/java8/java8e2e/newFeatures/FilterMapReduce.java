package com.learning.java8.java8e2e.newFeatures;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterMapReduce {

	public static void main(String[] args) {
		
		// to evaluate average salary of grade A employees
		double result = FilterMapReduce.getEmployees()
					.stream()
					.filter(emp -> emp.getGrade().equalsIgnoreCase("A"))
					.map(emp -> emp.getSalary())
					.mapToDouble(i->i)
					.average().getAsDouble();
		System.out.println(result);
		
		

	}
	
	public static List<Employee> getEmployees () {
		return Stream.of(new Employee(101, "prabhas", "A", 100000),
				new Employee(102, "sam", "B", 30000),
				new Employee(103, "disha", "B", 25000),
				new Employee(104, "ranbir", "A", 80000),
				new Employee(105, "imtiyaz", "C", 10000))
				.collect(Collectors.toList());
		
	}

}
