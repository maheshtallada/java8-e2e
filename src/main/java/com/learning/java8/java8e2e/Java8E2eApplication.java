package com.learning.java8.java8e2e;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import sorting.CollectionSort;
import sorting.Employee;
import sorting.SortPrimitiveTrdtnlAndLambda;

@SpringBootApplication
public class Java8E2eApplication {

	public static void main(String[] args) {
		SpringApplication.run(Java8E2eApplication.class, args);
		// https://www.baeldung.com/java-sorting
		
		Employee[] employees = new Employee[] { 
			      new Employee("John", 23, 5000), new Employee("Steve", 26, 6000), 
			      new Employee("Frank", 33, 7000), new Employee("Earl", 43, 10000), 
			      new Employee("Jessica", 23, 4000), new Employee("Pearl", 33, 6000)};
		
		//CollectionSort.sortById(Arrays.asList(employees));
		
		//CollectionSort.sortByIdAndThenSalary(Arrays.asList(employees));

		//SortPrimitiveTrdtnlAndLambda.sortTraditional();
		SortPrimitiveTrdtnlAndLambda.sortLambda();
		
	}

}
