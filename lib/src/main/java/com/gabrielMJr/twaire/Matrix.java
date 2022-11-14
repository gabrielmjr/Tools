package com.gabrielMJr.twaire;

class Matrix {
  // Classe que trata de matrizes

  // Converter de String [][] para int [][]
  protected int[][] toInteger(String[][] values) {
    int[][] integer_values;
    int lines_index = values.length;
    int columns_index = getTotalColumnsIndex(values);

    integer_values = new int[lines_index][columns_index];

    for (int i = 0; i < lines_index; i++) {
      for (int j = 0; j < columns_index; j++) {
        integer_values[i][j] = Integer.valueOf(values[i][j]);
      }
    }
    return integer_values;
  }

  // Converter de int [][] para String [][]
  protected String[][] toString(int[][] values) {
    String[][] string_values;
    int lines_index = values.length;
    int columns_index = getTotalColumnsIndex(values);

    string_values = new String[lines_index][columns_index];

    for (int i = 0; i < lines_index; i++) {
      for (int j = 0; j < columns_index; j++) {
        string_values[i][j] = String.valueOf(values[i][j]);
      }
    }
    return string_values;
  }

  // Converter de double [][] para String [][]
  protected String[][] toString(double[][] values) {
    String[][] string_values;
    int lines_index = values.length;
    int columns_index = getTotalColumnsIndex(values);

    string_values = new String[lines_index][columns_index];

    for (int i = 0; i < lines_index; i++) {
      for (int j = 0; j < columns_index; j++) {
        string_values[i][j] = String.valueOf(values[i][j]);
      }
    }
    return string_values;
  }

  // Pegar index das colunas em String [][]
  protected int getTotalColumnsIndex(String[][] values) {
    int columns_index = 0;

    for (int i = 0; i < 1; i++) {
      while (true) {

        try {
          String x = values[i][columns_index];
          columns_index++;
        } catch (ArrayIndexOutOfBoundsException error) {
          break;
        }
      }
    }
    return columns_index;
  }

  // Pegar index das colunas em int [][]
  protected int getTotalColumnsIndex(int[][] values) {
    int columns_index = 0;

    for (int i = 0; i < 1; i++) {
      while (true) {

        try {
          int x = values[i][columns_index];
          columns_index++;
        } catch (ArrayIndexOutOfBoundsException error) {
          break;
        }
      }
    }
    return columns_index;
  }

  // Pegar index das colunas em dounle [][]
  protected int getTotalColumnsIndex(double[][] values) {
    int columns_index = 0;

    for (int i = 0; i < 1; i++) {
      while (true) {

        try {
          double x = values[i][columns_index];
          columns_index++;
        } catch (ArrayIndexOutOfBoundsException error) {
          break;
        }
      }
    }
    return columns_index;
  }
}
