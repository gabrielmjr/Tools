package com.gabrielMJr.twaire.tools;

public class NumberAnalyst {
    public static String upper (int value) {
		if (value < 0)
			return "-" + upper(String.valueOf(-value));
		return upper(String.valueOf(value));
	}

	public static String upper (long value) {
		if (value < 0)
			return "-" + upper(String.valueOf(-value));
		return upper(String.valueOf(value));
	}

	private static String upper (String value) {
		String upperValue = new String();
		for (String figure: value.split("")) 
			switch (figure) {
				case "0":
				    upperValue += "⁰";
					break;
				case "1":
					upperValue += "¹";
					break;
				case "2":
				    upperValue += "²";
					break;
				case "3":
					upperValue += "³";
					break;
				case "4":
					upperValue += "⁴";
					break;
				case "5":
					upperValue += "⁵";
					break;
				case "6":
					upperValue += "⁶";
					break;
				case "7":
					upperValue += "⁷";
					break;
				case "8":
					upperValue += "⁸";
					break;
				case "9":
					upperValue += "⁹";
					break;
			}
		return upperValue;
	}
	
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
