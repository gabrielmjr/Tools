package com.GabrielMJr.Twaire.tools;

import com.GabrielMJr.Twaire.tools.Tools;

public class StringAnalyst extends Tools {

    /* Atributos
     * Classe que analisa as strings
     */

    /*
     * Retorna se value == null, retorne true, senão false
     */
    @Override
    public Boolean isNull(String value) {
        switch (value.replaceAll("\\s", "")) {
            case "":
                return true;

            default:
                return false;
        }
    }

    /*
     * Se value é somente pontos, retorne true
     * Reutilizado na classe matemática e física
     * github.com/gabrielmjr/PMath
     * github.com/gabrielmjr/PPhysic
     */
    @Override
    public Boolean isDot(String value) {

        // Método que verifica e retorna um Boolean      
        return StringAnalyst.verifyDots(value);
    }

    /*
     * Continuando com o método acima, isDot
     */

    private static Boolean verifyDots(String value) {

        // Contador de pontos
        int dotI = 0;

        String[] values = value.replaceAll("\\s", "").split("");

        for (String v: values) {
            switch (v) {
                case ".":              
                    // Acrescenta uma unidade sempre que tiver ponto
                    dotI++;
                    break;

                default:
                    break;
            }
        }

        /*
         * Verificar se o número de pontos == número de elementos de values
         * se for igual, retorne true, senão false
         */
        if (dotI == values.length) {
            return true;
        } else {
            return false;
        }
    }
}
