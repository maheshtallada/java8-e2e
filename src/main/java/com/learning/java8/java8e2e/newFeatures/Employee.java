package com.learning.java8.java8e2e.newFeatures;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	private int id;
	private String name;
	private String grade;
	private double salary;

}
