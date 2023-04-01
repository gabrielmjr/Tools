package com.gabrielmjr.twaire.tools;

public class StringAnalyst {
    public static boolean isEmpty (String value) {
		if (!(value instanceof String))
			return true;
		return value.replaceAll("\\s", "").isEmpty();
	}

	public static boolean isDot (String value) {
		if (isEmpty(value))
			return false;
		String[] figures = value.replaceAll("\\s", "").split("");
		int figuresLength = figures.length;
		int dotCounter = 0;
		for (String figure: figures) {
			if (figure.equals("."))
				dotCounter++;
		}
		if (dotCounter == figuresLength)
			return true;
		return false;
	}

	public static int countWords (String value) {
		int wordsCounter = 0;
		if (isEmpty(value))
			return wordsCounter;
		else {
		    String[] figures = value.replaceAll("\\s", "").split("");
			for (int i = 0; i < figures.length; i++)
			    wordsCounter = i;
		}
		return wordsCounter;
	}
}
