package com.GabrielMJr.Twaire.tools;

import com.GabrielMJr.Twaire.tools.ToolManager;

public class Tools implements ToolManager {

    private static final String CreatorName = "Gabriel MJr";
    private static final String GHCreator = "github.com/gabrielmjr";
    private static final String Version = "1.0.0";

    public static void main(String[] args) {
        return;
    }

    /*
     * Esses métodos foram sobrecarregado no StringAnalyst,
     * NumberAnalyst, List
     */
    @Override
    public Boolean isNull(String value) {
        return false; //StringAnalyst
    }

    @Override
    public Boolean isDot(String value) {
        return false; // StringAnalyst
    }

    @Override
    public String[] expNormalizer(Double value) {
        return new String[3]; // NumberAnalyst 
    }

    @Override
    public String[] valueOf(String value) {
        return new String[5]; // List
    }

    @Override
    public Long[] valueOf(Long value) {
        return new Long[5]; // List
    }

    @Override
    public int[] valueOf(int value) {
        return new int[5]; // list
    }

    @Override
    public String upper(Long value) {
        return null;
    } //NumberAnalyst

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
    
    @Override
    public String normalize(String[] values) {
      return null;
    }
}
