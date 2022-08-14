package com.GabrielMJr.Twaire.tools;

interface ToolManager {
    public abstract Boolean isNull(String value);
    public abstract Boolean isDot(String value);
    public abstract String[] expNormalizer(Double value);
    public abstract String[] valueOf(String value);
    public abstract int[] valueOf(int value);
    public abstract Long[] valueOf(Long value);
    public abstract String getCreatorName();
    public abstract String getGHCreator();
    public abstract String getVersion();
    public abstract String upper(Long value);
    public abstract String normalize(String[] values);
}
