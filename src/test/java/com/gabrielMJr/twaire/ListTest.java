package com.gabrielMJr.twaire.tools;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
  This class test theethods of List class
*/

public class ListTest
{
    // Attributes
    private Tools tools;
    
    // Constructor
    public ListTest()
    {
        // Initialize Toold class
        tools = new Tools();
    }
    
    /*
      List on value of method for String type
    */
    @Test
    public void listOnValueOfStringTest()
    {
        
        String value = "abc_def-ghi+jkl#mno!pqrs@tuv*wxyz";
        
        String[] values_result = tools.listOnValueOf(value);
        
        for (int i = 0; i < values_result.length; i++)
        {
            assertEquals(i, value.indexOf(values_result[i]));
        }
    }
    
    /*
      List on value of method for Long type
    */
    @Test
    public void listOnValueOfLongTest()
    {
        // General index size
        int index = 9;
        
        Long value = Long.valueOf(123456789);
        
        // As the value result need to be finally
        Long[] demonstration = new Long[index];
        
        for (int i = 0; i < index; i++)
        {
            demonstration[i] = Long.valueOf(i) + 1;
        }
        
        Long[] values_result = tools.listOnValueOf(value);
        
        for (int i = 0; i < index; i++)
        {
            assertEquals(demonstration[i], values_result[i]);
        }
    }
}