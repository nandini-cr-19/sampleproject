package com.java.anonymous;

import java.util.function.Function;

public class FunctionUseCase {
	public static void main(String[] args) {
		//Function to convert string to its length
		//here string is input and integer is output
		Function<String, Integer> getLength = str -> str.length();
		
		System.out.println("Length of 'Hello': " + getLength.apply("Hello"));
		System.out.println("Length of 'selenium': " + getLength.apply("Selenium"));
	}

}
