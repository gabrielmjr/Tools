package com.mjr.code.tools;

import org.junit.jupiter.api.Test;

import static com.mjr.code.tools.StringAnalyst.isEmpty;
import static com.mjr.code.tools.StringAnalyst.isDot;
import static com.mjr.code.tools.StringAnalyst.countWords;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringAnalystTest {
	@Test
	public void isEmptyTest() {
		String[] values = new String[] {
			null,
			"",
			"  ",
			"hey",
			"im not null"
		};
		boolean[] results = new boolean[] {
			true,
			true,
			true,
			false,
		    false
		};
		for (int i = 0; i < values.length; i++)
		    assertTrue(results[i] == isEmpty(values[i]));
	}
}
