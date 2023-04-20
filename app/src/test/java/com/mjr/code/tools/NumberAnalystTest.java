package com.mjr.code.tools;

import org.junit.jupiter.api.Test;

import static com.mjr.code.tools.NumberAnalyst.upper;
import static com.mjr.code.tools.NumberAnalyst.putParenthesesIfNegative;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberAnalystTest {
	@Test
	public void integerUpperTest () {
		int[] values = new int[] {
			8,
			3,
			62,
			724,
			-82648
		};
		String[] results = new String[] {
			"⁸",
			"³",
			"⁶²",
			"⁷²⁴",
			"-⁸²⁶⁴⁸"
		};
		for (int i = 0; i < values.length; i++)
            assertEquals(results[i], upper(values[i]));
	}
	
	@Test
	public void longUpperTest () {
		long[] values = new long[] {
			2,
			7,
			26,
			826,
			-6258
		};
		String[] results = new String[] {
			"²",
			"⁷",
			"²⁶",
			"⁸²⁶",
			"-⁶²⁵⁸"
		};
		for (int i = 0; i < values.length; i++)
            assertEquals(upper(values[i]), results[i]);;
	}
	
	@Test
	public void putParenthesesIfNegativeInInteger() {
	    int[] values = new int[] {
		    8,
		    3,
		    62,
		    -724,
		    -82648
		};
		String[] results = new String[] {
			"8",
			"3",
			"62",
			"(- 724)",
			"(- 82648)"
		};
		for (int i = 0; i < values.length; i++)
		    assertEquals(results[i], putParenthesesIfNegative(values[i]));
	}
	
	@Test
	public void putParenthesesIfNegativeInLong() {
		long[] values = new long[] {
			2,
			7,
			26,
			-826,
			-6258
		};
		String[] results = new String[] {
			"2",
			"7",
			"26",
			"(- 826)",
			"(- 6258)"
		};
		for (int i = 0; i < values.length; i++)
		    assertEquals(results[i], putParenthesesIfNegative(values[i]));
	}
	
	@Test
	public void putParenthesesIfNegativeInDouble() {
		double[] values = new double[] {
			-3.5,
			-2.5,
			8.4,
			-9.1,
			368.4
		};
		String[] results = new String[] {
			"(- 3.5)",
			"(- 2.5)",
			"8.4",
			"(- 9.1)",
			"368.4"
		};
		for (int i = 0; i < values.length; i++) {
			assertEquals(results[i], putParenthesesIfNegative(values[i]));
		}
	}
}
