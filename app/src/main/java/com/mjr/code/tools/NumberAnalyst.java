package com.mjr.code.tools;

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

	public static String upper(int value) {
		String upperValue = new String();
		String[] figures = String.valueOf(value).split("");
	    for (String figure: figures) {
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
		}
		return (value < 0) ? "-" + upperValue: upperValue;
	}

	public static String upper(long value) {
		String upperValue = new String();
	    String[] figures = String.valueOf(value).split("");
		for (String figure: figures) {
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
		}
		return(value < 0) ? "-" + upperValue: upperValue;
	}
}
