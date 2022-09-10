package com.gabrielMJr.twaire.tools;

import com.gabrielMJr.twaire.tools.ToolManager;
import com.gabrielMJr.twaire.tools.List;
import com.gabrielMJr.twaire.tools.NumberAnalyst;
import com.gabrielMJr.twaire.tools.StringAnalyst;

public class Tools implements ToolManager {

    private static final List list = new List();
    private static final NumberAnalyst numberAnalyst = new NumberAnalyst();
    private static final StringAnalyst stringAnalyst = new StringAnalyst();
    private static final String CreatorName = "Gabriel MJr";
    private static final String GHCreator = "github.com/gabrielmjr";
    private static final String Version = "1.0.1";


    public static void main(String[] args) {
        return;
    }


    @Override
    public Boolean isNull(String value) {
        return stringAnalyst.isNull(value); //StringAnalyst
    }

    @Override
    public Boolean isDot(String value) {
        return stringAnalyst.isDot(value); // StringAnalyst
    }

    @Override
    public Long[] expNormalizer(Double value) {
        return numberAnalyst.expNormalizer(value); // NumberAnalyst 
    }
    
    @Override
    public String normalize(Long[] value) {
      return numberAnalyst.normalize(value); // NumberAnalyst
    }

    @Override
    public String[] listOnValueOf(String value) {
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
     	return numberAnalyst.checkValue(value); // NumberQnalysr
    }
    
    @Override
    public String checkValue(int value) {
     	return numberAnalyst.checkValue(value); // NumberQnalysr
    }
    
    @Override
    public String checkValue(Long value) {
     	return numberAnalyst.checkValue(value); // NumberQnalysr
    }

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
