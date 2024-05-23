package com.app.junitDemo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DisplayNameOrderAnnotation {

	@Order(4)
	@DisplayName("4. Sign In button")
	@Test
	public void method1() {

		System.out.println("Test Sign In button");
	}

	@Order(1)
	@DisplayName("1. Username Field")
	@Test
	public void method2() {

		System.out.println("Test Username field");
	}

	@Order(2)
	@DisplayName("2. Password Field")
	@Test
	public void method3() {

		System.out.println("Test Password Field");
	}

	@Test
	@Order(3)
	@DisplayName("3. Forgot Password Field")
	public void method4() {

		System.out.println("Test Forgot password field");
	}

}
