package com.visualnuts;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class DivisorTest {
	
	private Divisor divisor;
	
	@Before
	public void before() {
		divisor = new Divisor();
	}
	
	@Test
	public void printTest() {
		for(int i = 1; i <= 500; i++) {
			divisor.print(i);
		}
	}
	
	@Test
	public void isDivisibleBy3Test() {
		assertTrue(divisor.isDivisibleBy3(3));
	}
	
	@Test
	public void isDivisibleBy15Test() {
		assertTrue(divisor.isDivisibleBy15(15));
	}
}
