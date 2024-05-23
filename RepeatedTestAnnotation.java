package com.app.junitDemo;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class RepeatedTestAnnotation {

	@RepeatedTest(2)
	@DisplayName("Repeated Test Example-1")
	public void repeatedTestExample(TestInfo testInfo) {

		assertTrue(3 > 2, "3 should be greater than 2");
		System.out.println("Executing test : " + testInfo.getDisplayName());
	}
	
	@Test
	public void AssumptionDemo() {
		
		boolean isDBServerUp = false;
		
		Assumptions.assumeTrue(isDBServerUp, "Server is not UP & Running");
		//////Create 5 table, 100 Insert queries
		System.out.println("Create tables and insert the data..");
	}

}
