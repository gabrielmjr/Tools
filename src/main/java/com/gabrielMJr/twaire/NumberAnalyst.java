package com.gabrielMJr.twaire.tools;

import java.util.ArrayList;

class NumberAnalyst {

    //Atributos
    private static double value;
    private static String[] values;
    
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
            result += " × 10" + upper(Long.valueOf(values[3]));
        }     
        return result;
    }    

   

    // Coloca os números em forma de expoente
    protected String upper(Long value) {
        if (value < 0) {
            value = -value;
            return "-" + NumberAnalyst.genUpper(value);
        } else {
            return genUpper(value);
        }
    }
    
        // Colocar os valores em minúsculo
    private static String genUpper(Long valueV) {
        Long[] values = new List().valueOf(valueV);
        String result = "";

        for (Long value: values) {
            if (value == 0) {
                result += "⁰";
            } else if (value == 1) {
                result += "¹";
            } else if (value == 2) {
                result += "²";
            } else if (value == 3) {
                result += "³";
            } else if (value == 4) {
                result += "⁴";
            } else if (value == 5) {
                result += "⁵";
            } else if (value == 6) {
                result += "⁶";
            } else if (value == 7) {
                result += "⁷";
            } else if (value == 8) {
                result += "⁸";
            } else if (value == 9) {
                result += "⁹";
            } else {
                result = null;
            }
          }
          return result;
        }
        
	
	/* Método que verifica um número value;
	 *  se value > 0, returna value entre parentesis˜
	 * senão, retorna n
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
