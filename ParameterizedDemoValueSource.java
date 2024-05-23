package com.app.junitDemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.util.StringUtils;

public class ParameterizedDemoValueSource {

	// @valueSource : This annotation will store multiple input values of different
	// datatypes.
	// String, integer, boolean
	// @ValueSource is a provide of test data.
	// @Test annotation can not pass parameter values of the method

	// @ParameterizedTest
	// it needs a source of values --> ValueSource
	// "abc", "xyz", ""

	@ValueSource(strings = { "abc", "pqr", "asdfsdaf", "tec" })
	@ParameterizedTest(name = "checkBlanks {arguments}")
	@EmptySource
	public void checkBlanks(String value) {

		Assertions.assertTrue(StringUtils.isBlank(value)); // input is null or not
		System.out.println(value);

	}

}
