package com.qvc.sample;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class BaseUnitTest {
	
	@Test
	@Tag("unit")
	public void testA() {
		assertTrue(true);
	}

}
