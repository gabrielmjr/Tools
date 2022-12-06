package com.gabrielMJr.twaire.tools;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
  This class tests methods of StringAnalyst class
*/
public class StringAnalystTest
{
    // Tools object
    private Tools tools;
    
    // Constructor
    public StringAnalystTest()
    {
        tools = new Tools();
    }
    
    
    /*
     Method that  check if some string is or isn't null
     String with only spaces are considered nulls
    */
    @Test
    public void isNullTest()
    {
        // Strings to be tested
        String value_1 = null;
        String value_2 = "    ";
        String value_3 = "+$test";
        
        // Need to be true
        assertEquals(true, tools.isNull(value_1));
        
        // Need to be true
        assertEquals(true, tools.isNull(value_2));
        
        // Need to be false
        assertEquals(false, tools.isNull(value_3));
    }
    
    
    /*
     Is dot method test
     This method check if some String just has or hasn't dots
    */
    @Test
    public void isDotTest()
    {
        // Strings to be tested
        String value_1 = "";
        String value_2 = "test";
        String value_3 = ".test.";
        String value_4 = "...";
        String value_5 = "  .... ";
        
        // Need to be false
        assertEquals(false, tools.isDot(value_1));
        
        // Need to be false
        assertEquals(false, tools.isDot(value_2));
        
        // Need to ne false
        assertEquals(false, tools.isDot(value_3));
        
        // Need to be true
        assertEquals(true, tools.isDot(value_4));
        
        // Need to be true
        assertEquals(true, tools.isDot(value_5));
    }
    
    
    /*
     Count word method test
    */
    @Test
    public void countWordsMethod()
    {
        // Strings to be tested
        String value = "I have nineteen words";
        
        int value_result = 18;
        
        // Need to be false
        assertEquals(value_result, tools.countWords(value));
    }
}