package com.mjr.code.tools;

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
}
