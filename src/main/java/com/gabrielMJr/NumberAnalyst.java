package com.gabrielMJr.tools;

import java.util.ArrayList;
import com.gabrielMJr.tools.StringAnalyst;

class NumberAnalyst {

    //Atributos
    private static double value;
    private static String[] values;
    
    // StringAnalyst object
    private static StringAnalyst sAnalyst = new StringAnalyst();
    
    // Numbers vector
    private static int[] numbers = new int[]
        {
           1, 2, 3, 4, 5, 6, 7, 8, 9, 0 
        };
    
    // The result in parts
    private static Long integer;
    private static Long decimal;
    private static Long exponential;
    
    
    
    /*
     * Normalizar o expoente
     */
    protected ArrayList<Long> expNormalizer(Double value) {
        
        // Setting the value to the class variable
        this.value = value;
        
        // Converting value to an string list
        this.values = String.valueOf(value).split("");
        
        ArrayList<Long> result = new ArrayList<>();
        
        generateInteger();
        
        result.add(getInteger());
        result.add(getDecimal());
        
        return result;
    }
    
    private void generateInteger()
    {
    
      // String that contains integer value
      String integerValues = "";
      String decimalvalues = "";

      for (int i = 0; i < values.length; i++)
      {
        switch(values[i])
        {
          case ".":
            
            // Getting decimal values
            for (int j = i; j < values.length; j++)
            {
              switch(values[j])
              {
                case "E":
                  break;
                  
                default:
                  decimalvalues += values[j];
              }
            }
            break;
              
          default:
            integerValues += values[i];
        }
      }
      
      setInteger(Long.valueOf(integerValues));
      setDecimal(Long.valueOf(decimalvalues));
      
    }

    


    /* Normaliza valores retornados por ExpNormalizer*/
    protected String normalize(Long[] values) {
        String result = values[0] + ".";
        result += values[2];
        if (values[1] == 3) {
            result += " ?? 10" + upper(Long.valueOf(values[3]));
        }     
        return result;
    }    

   

    // Coloca os n??meros em forma de expoente
    protected String upper(Long value) {
        if (value < 0) {
            value = -value;
            return "-" + NumberAnalyst.genUpper(value);
        } else {
            return genUpper(value);
        }
    }
    
        // Colocar os valores em min??sculo
    private static String genUpper(Long valueV) {
        Long[] values = new List().valueOf(valueV);
        String result = "";

        for (Long value: values) {
            if (value == 0) {
                result += "???";
            } else if (value == 1) {
                result += "??";
            } else if (value == 2) {
                result += "??";
            } else if (value == 3) {
                result += "??";
            } else if (value == 4) {
                result += "???";
            } else if (value == 5) {
                result += "???";
            } else if (value == 6) {
                result += "???";
            } else if (value == 7) {
                result += "???";
            } else if (value == 8) {
                result += "???";
            } else if (value == 9) {
                result += "???";
            } else {
                result = null;
            }
          }
          return result;
        }
        
	
	/* M??todo que verifica um n??mero value;
	 *  se value > 0, returna value entre parentesis??
	 * sen??o, retorna n
	 */
	//Sobrecarga do tipo double
	protected String checkValue(double value) {
		if (value < 0) {
			return "(" + value + ")"; 
		} else {
			return String.valueOf(value);
		} 
	}
	
	// Sobrecarga do tipo int
	protected String checkValue(int value) {
		if (value < 0) {
			return "(" + value + ")"; 
		} else {
			return String.valueOf(value);
		}
	}
	
	// Sobrecarga do tipo Long
	protected String checkValue(Long value) {
		if (value < 0) {
			return "(" + value + ")"; 
		} else {
			return String.valueOf(value);
		} 
	}
	
	
	// Get number from vector
	protected Long getNumberFromVector(String[] vector)
	{
        // String number variable
        String numberString = "";
  
        // Get word from words
        for (String value: vector)
        {
            // Check if it's null
            if(sAnalyst.isNull(value))
            {
                // Continue the loop
                continue;
            }
            else
            {
                // Get algarism from word.split("")
                for (String v: value.split(""))
                {
                   // Get number from numbers
                    for (int num:numbers)
                    {
                    // Surround with    try catch for errors
                        try
                        {
                            // Convert v to integer and check if its the same as number
                            if (Integer.valueOf(v) == num)
                            {
                                // Check if StringNumber is null
                                if (sAnalyst.isNull(numberString))
                                {
                                                        numberString = v;
                                }
                
                                // Else, append stringNumber
                                else
                                { 
                                    numberString += v;
                                }
                            }
                        }
                        // If the conversion arent compatible, continue the loop
                        catch (NumberFormatException nfe)
                        {
                            continue;
                        }
                    }
                }
            }
        }
    // Return the result
    return Long.valueOf(numberString);
    }
	
	// Getter and setters
	public Long getInteger()
	{
		return integer;
	}
	
	private void setInteger(Long integer)
	{
		this.integer = integer;
	}
	
	public Long getDecimal()
	{
		return decimal;
	}
	
	private void setDecimal(Long decimal)
	{
		this.decimal = decimal;
	}
	
	public Long getExponential()
	{
		return exponential;
	}
	
	private void setExponential(Long exponential)
	{
		this.exponential = exponential;
	}
}
