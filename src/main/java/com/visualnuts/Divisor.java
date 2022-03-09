package com.visualnuts;

public class Divisor {
	
	public void print(int number) {
		if(isDivisibleBy15(number)) {
			System.out.println("Visual Nuts");
		} else if(isDivisibleBy3(number)) {
			System.out.println("Visual");
		} else if(isDivisibleBy5(number)) {
			System.out.println("Nuts");
		} else {
			System.out.println(number);
		}
	}
	
	public boolean isDivisibleBy3(int number) {
		return number % 3 == 0;
	}
	
	public boolean isDivisibleBy5(int number) {
		String snumber = Integer.toString(number);
		int size = snumber.length();
		return (Integer.parseInt(snumber.substring(size - 1)) == 5)
	            || (Integer.parseInt(snumber.substring(size - 1)) == 0);
	}
	
	public boolean isDivisibleBy15(int number) {
		return isDivisibleBy3(number) && isDivisibleBy5(number);
	}
}
