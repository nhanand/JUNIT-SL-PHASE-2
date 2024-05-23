package com.app.junitDemo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BeforeAfterEachAnnotation {

	JavaOperations obj;

	@BeforeEach // excute the init() before each test method
	public void init() { // pre-condition method

		System.out.println("Start DB Connection..");

		obj = new JavaOperations();

		System.out.println("Initalization is done..");

	}

	@AfterEach
	public void tearDown() { // Post-condition

		System.out.println("Close DB Connection");

	}

	@Test
	public void test1() {

		System.out.println("Execute the test case-1...");

	}

	@Test
	public void test2() {

		System.out.println("Execute the test case-2...");

	}

	@Test
	public void test3() {

		System.out.println("Execute the test case-3...");

	}

}
