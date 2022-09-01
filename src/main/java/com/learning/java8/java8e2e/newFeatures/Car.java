package com.learning.java8.java8e2e.newFeatures;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Car {
	
	private String brand;
	private Integer launchYear;
	private List<String> customers;

}
