package com.learning.java8.java8e2e.designPatterns.structural.adapter;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BankDetails {
	
	// This is the adaptee class.  
	
	private String bankName;
	private String accHolderName;
	private long accNumber;

}