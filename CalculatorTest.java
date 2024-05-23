package com.app.junitDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	private static Calculator calc;
	
	
	@BeforeAll
	public static void setUpClass() {
		
		System.out.println("BeforeAll: Initializing resources...");
		
		 calc = new Calculator();
	}
	
	@AfterAll
	public static void tearDownClass() {
		
		System.out.println("AfterAll: Cleaning up the resources...");
		calc = null;
		
		
	}
	@BeforeEach
	public void setUp() {
		
		System.out.println("BeforeEach: Setting up before each test..");
	}
	
	@Test
	public void testAdd() {
		
		
		System.out.println("Test : testAdd");
		assertEquals(5, calc.add(2, 3));
	}
	@Test
	public void testSubtract() {
		
		
		System.out.println("Test : testSubtract");
		assertEquals(1, calc.subtract(5, 4));
	}

}
