package com.gabrielMJr.twaire.tools;

interface ToolManager {
    public abstract Boolean isNull(String value);
    public abstract Boolean isDot(String value);
    public abstract Long[] expNormalizer(Double value);
    public abstract String normalize(Long[] value);
    public abstract String[] listOnValueOf(String value);
    public abstract int[] listOnValueOf(int value);
    public abstract Long[] listOnValueOf(Long value);
    public abstract String upper(Long value);
    public abstract String checkValue(double value);
    public abstract String checkValue(int value);
    public abstract String checkValue(Long value);
    public abstract String getCreatorName();
    public abstract String getGHCreator();
    public abstract String getVersion();
    
}