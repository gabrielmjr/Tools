package com.gabrielmjr.tools;

public class NumberAnalyst {
	
	public static String putParenthesesIfNegative(int value) {
		return (value < 0) ? "(- " + (- value) + ")" : String.valueOf(value);
	}
	
	public static String putParenthesesIfNegative(long value) {
		return (value < 0) ? "(- " + (- value) + ")" : String.valueOf(value);
	}
	
	public static String putParenthesesIfNegative(double value) {
		return (value < 0) ? "(- " + (- value) + ")" : String.valueOf(value);
	}
}
