package com.GabrielMJr.Twaire.tools;

import com.GabrielMJr.Twaire.tools.Tools;

public class List extends Tools {

    /* Converter Long em lista
     */
    @Override
    public Long[] valueOf(Long value) {
        String svalue = String.valueOf(value);
        String[] list = svalue.split("");
        Long[] list1 = new Long[list.length - 1];
        int index = 0;
        for (String res: list) {
            switch (res.replaceAll("\\s", "")) {
                case "":
                    break;

                default:
                    list1[index] = Long.valueOf(res);
                    index++;
            }
        }
        return list1;
    }

    /*Converter inteiros em lista
     */
    @Override
    public int[] valueOf(int value) {
        String svalue = String.valueOf(value);
        String[] list = svalue.split("");
        int[] list1 = new int[list.length - 1];
        int index = 0;
        for (String res: list) {
            switch (res.replaceAll("\\s", "")) {
                case "":
                    break;

                default:
                    list1[index] = Integer.valueOf(res);
                    index++;
            }
        }
        return list1;
    }

    /*Converter String em lista
     * A string não deve conter espaços
     * Separator é uma espécie de separadora de Strings
     * ex: 7262-87227-2737, o separador é -
     */
    @Override
    public String[] valueOf(String value) {       
        String[] list = value.split("");
        String[] list1 = new String[list.length - 1];
        int index = 0;
        for (String res: list) {
            switch (res.replaceAll("\\s", "")) {
                case "":
                    break;

                default:
                    list1[index] = res;
                    index++;
            }
        }
        return list1;
    }
}
