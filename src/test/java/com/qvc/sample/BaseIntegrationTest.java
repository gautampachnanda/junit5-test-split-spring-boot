package com.qvc.sample;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class BaseIntegrationTest {

	
	@Test
	@Tag("integration")
	public void testB() {
		// BAD TEST JUST TO SHOW IT RUNS
		assertTrue(true);
	}
}
