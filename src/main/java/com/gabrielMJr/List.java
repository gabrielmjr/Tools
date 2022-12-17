package com.gabrielMJr.tools;

class List {

  // Atributos
  private static Long[] xLong;
  private static Long[] yLong;

  /* Converter Long em lista */
  protected Long[] valueOf(Long value) {
    String sValue = String.valueOf(value);
    String[] list = valueOf(sValue);
    Long[] list1 = new Long[list.length];
    int index = 0;
    for (String res : list) {
      switch (res) {
        case "":
          break;

        default:
          list1[index] = Long.valueOf(res);
          index++;
      }
    }
    return list1;
  }

  /* Converter Long[][] em lista, vai ter que retornar duas Listas */
  protected void matrixToLists(Long[][] matrix) {
    setX(matrix[0]);
    setY(matrix[1]);
  }

  protected void setX(Long[] value) {
    xLong = value;
  }

  protected Long[] getX() {
    return xLong;
  }

  protected void setY(Long[] value) {
    yLong = value;
  }

  protected Long[] getY() {
    return yLong;
  }

  /* Converter inteiros em lista */
  protected int[] valueOf(int value) {
    String sValue = String.valueOf(value);
    String[] list = valueOf(sValue);
    int[] list1 = new int[list.length];
    int index = 0;
    for (String res : list) {
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

  /* Converter String em String[] */
  protected String[] valueOf(String value) {
    String[] list = value.replaceAll("\\s+", "").split("");
    String[] list1 = new String[list.length];
    int index = 0;
    for (String res : list) {
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
