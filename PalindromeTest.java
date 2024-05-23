package com.app.junitDemo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class PalindromeTest {

	private boolean isPalindrome(String str) {

		if (str == null) {

			return false;
		}

		String cleanedStr = str.replaceAll("[\\W_]", "").toLowerCase();
		String reversedStr = new StringBuilder(cleanedStr).reverse().toString();
		return cleanedStr.equals(reversedStr);

	}
	@TestFactory
	Collection<DynamicTest> dynamicPalindromeTests() {

		String[] inputs = { "madam", "apple", "nitin", "car" };

		return Arrays.stream(inputs)
				.map(input -> DynamicTest.dynamicTest("Checking if '" + input + "' is a palindrome",
						() -> assertTrue(isPalindrome(input), "Expected '" + input + "' to be a palindrome")))
				.collect(Collectors.toList());

	}

}
