package com.algs4.fun;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

@Tag("fast")
class FirstTest {
	
	@Test
	@Tag("fast")
	@DisplayName("My 1st JUnit 5 test! ðŸ˜Ž")
	void myFirstTest(TestInfo testInfo) {
		 Bag<String> bag = new Bag<>();
		//assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
		Calculator calculator = new Calculator();
		assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
		assertEquals("My 1st JUnit 5 test! ðŸ˜Ž", testInfo.getDisplayName(), () -> "TestInfo is injected correctly");
		//assertEquals(2, 1, "2 is not equal to 1");
	}
}