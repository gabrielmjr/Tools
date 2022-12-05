package com.gabrielMJr.twaire.tools;

import com.gabrielMJr.twaire.tools.List;
import com.gabrielMJr.twaire.tools.Matrix;
import com.gabrielMJr.twaire.tools.NumberAnalyst;
import com.gabrielMJr.twaire.tools.StringAnalyst;
import com.gabrielMJr.twaire.tools.ToolManager;

import java.util.ArrayList;

public class Tools implements ToolManager {

  private static final List list = new List();
  private static final NumberAnalyst numberAnalyst = new NumberAnalyst();
  private static final StringAnalyst stringAnalyst = new StringAnalyst();
  private static final Matrix matrix = new Matrix();

  private static final String CreatorName = "Gabriel MJr";
  private static final String GHCreator = "github.com/gabrielmjr";
  private static final String Version = "1.0.2";

  @Override
  public Boolean isNull(String value) {
    return stringAnalyst.isNull(value); // StringAnalyst
  }

  @Override
  public Boolean isDot(String value) {
    return stringAnalyst.isDot(value); // StringAnalyst
  }

  @Override
  public ArrayList<Long> expNormalizer(Double value) {
    return numberAnalyst.expNormalizer(value); // NumberAnalyst
  }

  @Override
  public String normalize(Long[] value) {
    return numberAnalyst.normalize(value); // NumberAnalyst
  }

  @Override
  public String[] listOnValueOf(String value)
  {
    return list.valueOf(value); // List
  }

  @Override
  public Long[] listOnValueOf(Long value) {
    return list.valueOf(value); // List
  }

  @Override
  public int[] listOnValueOf(int value) {
    return list.valueOf(value); // list
  }

  @Override
  public String upper(Long value) {
    return numberAnalyst.upper(value);
  } // NumberAnalyst

  @Override
  public String checkValue(double value) {
    return numberAnalyst.checkValue(value); // NumberAnalyst
  }

  @Override
  public String checkValue(int value) {
    return numberAnalyst.checkValue(value); // NumberAnalyst
  }

  @Override
  public String checkValue(Long value) {
    return numberAnalyst.checkValue(value); // NumberAnalyst
  }

  @Override
  public int countWords(String value) {
    return stringAnalyst.countWords(value); // StringAnalyst
  }

  @Override
  public int[][] toInteger(String[][] values) {
    return matrix.toInteger(values);
  } // Matrix

  @Override
  public String[][] toString(int[][] values) {
    return matrix.toString(values);
  } // Matrix

  @Override
  public String[][] toString(double[][] values) {
    return matrix.toString(values);
  } // Matrix

  @Override
  public int getTotalColumnsIndex(String[][] values) {
    return matrix.getTotalColumnsIndex(values);
  } // Matrix

  @Override
  public int getTotalColumnsIndex(int[][] values) {
    return matrix.getTotalColumnsIndex(values);
  } // Matrix

  @Override
  public int getTotalColumnsIndex(double[][] values) {
    return matrix.getTotalColumnsIndex(values);
  } // Matrix

  @Override
  public String getCreatorName() {
    return Tools.CreatorName;
  }

  @Override
  public String getGHCreator() {
    return Tools.GHCreator;
  }

  @Override
  public String getVersion() {
    return Tools.Version;
  }
}
