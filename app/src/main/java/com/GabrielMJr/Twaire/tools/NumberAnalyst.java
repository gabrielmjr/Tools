package com.GabrielMJr.Twaire.tools;

import com.GabrielMJr.Twaire.tools.Tools;
import com.GabrielMJr.Twaire.tools.List;

public class NumberAnalyst extends Tools {

    // Atributos
    private static final Boolean idb = true; // Is Decimal (boolean)
    private static Boolean ixb; // Is Exponencial (boolean)


    /*
     * Normalizar o expoente
     */
    @Override
    public String[] expNormalizer(Double value) {
        // Indices, contadores e atrinutos
        List list = new List();
        String[] values= list.valueOf(String.valueOf(value).replaceAll("\\s", ""));
        NumberAnalyst.setIsExponencial(false);
        return NumberAnalyst.expN(values, list);
    }
    
    
    /* Pode ser reaproveitado junto de expNormalizer para */
    @Override
    public String normalize(String[] values) {
      String result = values[0] + ".";
      result += values[2];
      if (Integer.valueOf(values[1]) == (3)) {
        result += " × 10" + this.upper(Long.valueOf(values[3]));
      }
      
      return result;
    }

    /* Nota de result:
     * index 0 = número inteiro
     * index 1 = O número inserido é decimal:
     *   - se 0 então não é nenhum deles
     *   - se 1 então é decimal
     *   - se 2 então é exponencial
     *   - se 3 então são os dois
     * index 2 = número decimal
     * index 3 = número exponencial
     */
    // Continuando com o método expNormalizer
    private static String[] expN(String[] values, List list) {
        // Atributos locais
        int i;
        int j;
        int k;
        String natural = ""; // String que contém o valor natural
        String decimal = ""; // String que contém o valor decimal
        String result[] = new String[3]; // Resultado final
        for (i = 0; i <= values.length - 1; i++) {
            switch (values[i].replaceAll("\\s", "")) {
                case ".": // Caso tenha "."/ seja decimal
                    // Pegando somente a parte natural da lista
                    for (j = 0; j <= i - 1; j++) {
                        natural = natural + values[j];
                    }

                    // Pegando somente o decimal
                    for (k = j + 1; k <= values.length - 1; k++) {
                        decimal = decimal + values[k];                  
                    } 
                    break;

                case "E":
                    NumberAnalyst.setIsExponencial(true);

                default:
                    break;

            } 
        }

        // Resultado da verificação de decimal e exponencial
        result[1] = String.valueOf(NumberAnalyst.checkValues(NumberAnalyst.isDecimal(), NumberAnalyst.isExponencial()));

        // Retornando valores de acordo com os resultados
        if (Integer.valueOf(result[1]) == 1) {
            result[0] = natural;
            result[2] = NumberAnalyst.genDecimal(decimal, list)[0];
            return result;
        } else if (Integer.valueOf(result[1]) == 3) {
            String[] res = new String[4];
            String[] res1;
            res[0] = natural;
            res[1] = result[1];
            res1 = NumberAnalyst.genDecimal(decimal, list);
            res[2] = res1[0];
            res[3] = res1[1];
            return res;
        } else {
            return new String[3];
        }

    }

    /* Verifica valores lógicos de 2 argumentos
     * Nota:
     *   retorna 0 se não tiver parte decimal e exponencial
     *   retorna 1 se tiver parte decimal mas sem exponencial
     *   retorna 2 se não tiver decimal mas tiver exponencial
     *   retorna 3 se tiver decimal e exponencial
     */
    private static int checkValues(Boolean isValue1, Boolean isValue2) {
        int isV1;
        int isV2;
        switch (String.valueOf(isValue1)) {
            case "true":
                isV1 = 1;
                break;

            default:
                isV1 = 0;
                break;
        }

        switch (String.valueOf(isValue2)) {
            case "true":
                isV2 = 2;
                break;

            default:
                isV2 = 0;
        }

        return isV1 + isV2;
    }

    /* Tratamento da parte decimal do valor inserido
     * List = com.GabrielMJr.Twaire.tools.List
     */
    private static String[] genDecimal(String decimal, List list) {
        String[] values = list.valueOf(decimal);
        int index = values.length - 1;
        String finall = "";
        String[] result = new String[2];
        String expoente = "";
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        int n = 0;

        // Índice de "E"
        for (int m = 0; m <= index; m++) {
            switch (values[m]) {
                case "E":
                    l = m;
                    break;

                default:
                    break;
            }
        }

        // Se não for exponencial
        for (i = 0; i <= index; i++) {
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
                for (; k <= l - 1; k++) {
                    if (index - l >= 3 && j <= 3) {
                        finall = finall + values[k];
                        j++;
                    } else if (index - l == 2 && j <= 2) {
                        finall = finall + values[k];
                        j++;
                    } else if (index - l == 1 && j <= 1) {
                        finall = finall + values[k];
                        j++;
                    } else if (index - l == 0) {
                        finall = values[k];
                    }
                }
            }
        }

        for (n = l + 1; n <= index; n++) {
            expoente = expoente + values[n];    
        }
        result[0] = finall;
        result[1] = expoente;
        return result;
    }

    // Coloca os números em forma de expoente
    @Override
    public String upper(Long value) {
        if (value < 0) {
            value = -value;
            return "-" + NumberAnalyst.genUpper(value);
        } else {
            return NumberAnalyst.genUpper(value);
        }
    }

    // Colocar os valores em minúsculo
    private static String genUpper(Long value) {
        Long[] values = new List().valueOf(value);
        String result = "";

        for (int i = 0; i <= values.length - 1; i++) {
            if (values[i] == 0) {
                result += "⁰";
            } else if (values[i] == 1) {
                result += "¹";
            } else if (values[i] == 2) {
                result += "²";
            } else if (values[i] == 3) {
                result += "³";
            } else if (values[i] == 4) {
                result += "⁴";
            } else if (values[i] == 5) {
                result += "⁵";
            } else if (values[i] == 6) {
                result += "⁶";
            } else if (values[i] == 7) {
                result += "⁷";
            } else if (values[i] == 8) {
                result += "⁸";
            } else if (values[i] == 9) {
                result += "⁹";
            } else {
                result = null;
            }
        }

        return result;
    }


    private static Boolean isDecimal() {
        return NumberAnalyst.idb;
    }

    private static void setIsExponencial(Boolean value) {
        NumberAnalyst.ixb = value;
    }

    private static Boolean isExponencial() {
        return NumberAnalyst.ixb;
    }
}
