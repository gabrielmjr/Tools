package com.gabrielMJr.twaire.tools;

class StringAnalyst{

  /* Atributos
   * Classe que analisa as strings
   */

  /*
   * Retorna se value == null, retorne true, senão false
   */
  protected Boolean isNull(String value) {
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
   * github.com/gabrielmjr/Physic
   */
  protected Boolean isDot(String value) {

    // Método que verifica e retorna um Boolean
    return this.verifyDots(value);
  }

  /*
   * Continuando com o método acima, isDot
   */

  private Boolean verifyDots(String value) {
  
    // Contador de pontos
    int dotI = 0;
    int index;

    String[] values = value.replaceAll("\\s+", "").split("");
    index = values.length;

    for (String v : values) {
      if (v.equals(".")) {
        dotI++;
      } else if (this.isNull(v)) {
        index--;
      }
    }

    /*
     * Verificar se o número de pontos == número de elementos de values
     * se for igual, retorne true, senão false
     */
    if (dotI == index) {
      return true;
    } else {
      return false;
    }
  }
}
