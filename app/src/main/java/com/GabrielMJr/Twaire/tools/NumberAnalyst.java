package com.gabrielMJr.twaire.tools;

class NumberAnalyst {

    //Atributos
    
    private final Boolean idb = true; // Is Decimal (boolean)
    private Boolean ixb; // Is Exponencial (boolean)
    
    
    /*
     * Normalizar o expoente
     */
    protected Long[] expNormalizer(Double value) {
        // Indices, contadores e atrinutos
        List list = new List();
        String[] values= list.valueOf(String.valueOf(value));
        this.setIsExponencial(false);
        return this.expN(values, list);
    }


    private Long[] expN(String[] values, List list) {
        // Atributos locais
        int i;
        int j;
        int k;
        String natural = ""; // String que contém o valor natural
        String decimal = ""; // String que contém o valor decimal
        Long result[] = new Long[3]; // Resultado final
        
        for (i = 0; i < values.length; i++) {
            switch (values[i].replaceAll("\\s", "")) {
                case ".": // Caso tenha "."/ seja decimal
                    // Pegando somente a parte natural da lista
                    for (j = 0; j < i; j++) {
                        natural += values[j];
                    }

                    // Pegando somente o decimal
                    for (k = j + 1; k < values.length; k++) {
                        decimal += values[k];
                    }
                    break;

                case "E":
                    this.setIsExponencial(true);

                default:
                    break;
            }
        }

        // Resultado da verificação de decimal e exponencial
        result[1] = checkValues(isDecimal(), isExponencial());

        // Retornando valores de acordo com os resultados
        if (result[1] == 1) {
            result[0] = Long.valueOf(natural);
            result[2] = genDecimal(decimal, list)[0];
            return result;
            
        } else if (result[1] == 3) {
            Long[] res = new Long[4];
            Long[] res1 = genDecimal(decimal, list);
            res[0] = Long.valueOf(natural);
            res[1] = result[1];
            res[2] = res1[0];
            res[3] = res1[1];
            return res;
        } else {
            return result;
        }
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

    /* Verifica valores lógicos de 2 argumentos
     * Nota:
     *   retorna 0 se não tiver parte decimal e exponencial
     *   retorna 1 se tiver parte decimal mas sem exponencial
     *   retorna 2 se não tiver decimal mas tiver exponencial
     *   retorna 3 se tiver decimal e exponencial
     */
    private static Long checkValues(Boolean isValue1, Boolean isValue2) {
        int isV1;
        int isV2;
        if (isValue1) {
            isV1 = 1;
         } else {
            isV1 = 0;
         }

        if (isValue2) {
                isV2 = 2;
         } else {
                isV2 = 0;
         }

        return Long.valueOf(isV1 + isV2);
    }

  
    /* Tratamento da parte decimal do valor inserido
     * List = com.GabrielMJr.Twaire.tools.List
     */
    private Long[] genDecimal(String decimal, List list) {
        String[] values = list.valueOf(decimal);
        int index = values.length;
        String finall = "";
        Long[] result = new Long[2];
        String expoente = "";
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        int n = 0;

        // Índice do inicio da parte exponencial 
        for (int m = 0; m < index; m++) {
            switch (values[m]) {
                case "E":
                    l = m + 1;
                    break;

                default:
                    break;
            }
        }

        // Se não for exponencial
        for (i = 0; i < index; i++) {
            // Se for somente decimal
            if (l == 0) {
                if (index >= 3 && j <= 3) {
                    finall = finall + values[i];
                    j++;
                } else if (index == 2 && j <= 2) {
                    finall = finall + values[i];
                    j++;
                } else if (index == 1 && j <= 1) {
                    finall = finall + values[i];
                    j++;
                } else if (index == 0) {
                    finall = finall + values[i];
                }

                // Se for exponencial
            } else {
                for (; k < l - 1; k++) {
                    if (index - l - 1 >= 3 && j <= 3) {
                        finall = finall + values[k];
                        j++;
                    } else if (index - l - 1 == 2 && j <= 2) {
                        finall = finall + values[k];
                        j++;
                    } else if (index - l - 1 == 1 && j <= 1) {
                        finall = finall + values[k];
                        j++;
                    } else if (index - l - 1 == 0) {
                        finall = values[k];
                    }
                }
            }
        }

        try {
            for (n = l; n < index; n++) {
                expoente += values[n];   
            }
        } catch (NumberFormatException exp){
            for (n = l - 1; n < index; n++) {
                expoente += values[n];
            }
        } 
        result[0] = Long.valueOf(finall);
        result[1] = Long.valueOf(expoente);
        return result;
    }

    // Coloca os números em forma de expoente
    protected String upper(Long value) {
        if (value < 0) {
            value = -value;
            return "-" + NumberAnalyst.genUpper(value);
        } else {
            return NumberAnalyst.genUpper(value);
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




    private Boolean isDecimal() {
        return this.idb;
    }

    private void setIsExponencial(Boolean value) {
        this.ixb = value;
    }

    private Boolean isExponencial() {
        return this.ixb;
    }
}
