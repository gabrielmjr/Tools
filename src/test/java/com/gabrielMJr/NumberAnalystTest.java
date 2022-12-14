package com.gabrielMJr.tools;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 This class tests NumberAnalyst methods
*/
public class NumberAnalystTest
{
    
    // Tools object
    private Tools tools;
    
    // constructor
    public NumberAnalystTest()
    {
        // instantiating the object
        tools = new Tools();
    }
    
    
    /*
     This method tests check value method
     the method works like:
     For integer type:
     int i = 9;
     int j = -8;
     
     String res_i = tools.checkValue(i);
     String res_j = tools.checkValue(j);
     
     System.out.println("For i: " + res_i);
     System out.println("For j: " + res_j);
     
     OUTPUT:
     For i: 9
     For j: (-8)

    */
    @Test
    public void checkValueTest()
    {
        // For double types
        Double double_value_1 = 127.5;
        Double double_value_2 = -128.5;
        
        //For int values
        // Values to be tested
        int integer_value_1 = 127;
        int integer_value_2 = -128;
        
        // For Long values
        Long long_value_1 = Long.valueOf(255);
        Long long_value_2 = Long.valueOf(-256);
        
        // Results need to be:
        // Double
        String double_value_1_result = "127.5";
        String double_value_2_result = "(-128.5)";
        
        // Integer
        String integer_value_1_result = "127";
        String integer_value_2_result = "(-128)";
        
        // Long
        String long_value_1_result = "255";
        String long_value_2_result = "(-256)";
        
        // Testing
        assertEquals(double_value_1_result, tools.checkValue(double_value_1));
        assertEquals(double_value_2_result, tools.checkValue(double_value_2));

        assertEquals(integer_value_1_result, tools.checkValue(integer_value_1));
        assertEquals(integer_value_2_result, tools.checkValue(integer_value_2));
        
        assertEquals(long_value_1_result, tools.checkValue(long_value_1));
        assertEquals(long_value_2_result, tools.checkValue(long_value_2));
    }
  
    /*
     This method tests upper method, like: 9 = ???
    */
    @Test
    public void upperTest()
    {
        // Values to be tested
        Long value = Long.valueOf(1234567890);
    
        // Result need to be:
        String value_result = "???????????????????????????";
    
        // The values need to be the same
        assertEquals(value_result, tools.upper(value));
    }
    
    /*
     This method tests get number from vector method , its like:
     String[] vector = new String[]
         {
             "63hf", "ndu8", "721"
         };
         
     The method must return a long value like: 638721
    */
    @Test
    public void getNumberFromVectorTest()
    {
        // Values to be tested
        String[] vector_1 = new String[]
            {
                "378", "hhj76", "hdb67jd"
            };
            
        String[] vector_2 = new String[]
            {
                "-$-jdh84", "!;#-)jhd", "y736==???jhs"
            };
            
        // Results must be:
        Long result_1 = Long.valueOf(3787667);
        Long result_2 = Long.valueOf(84736);
        
        // Testing
        assertEquals(result_1, tools.getNumberFromVector(vector_1));
        assertEquals(result_2, tools.getNumberFromVector(vector_2));
    }
}