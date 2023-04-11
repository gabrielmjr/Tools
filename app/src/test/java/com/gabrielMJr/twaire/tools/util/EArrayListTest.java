package com.gabrielmjr.tools.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EArrayListTest {
    private EList instance00000;
    private EList instance00001;
    private EList instance00002;
    private EList instance00003;
    private EList instance00004;
    
    private EList<?> instance00100;
    private EList<?> instance00101;
    private EList<?> instance00102;
    
    private EList<Object> instance00200;
    private EList<Object> instance00201;
    private EList<Object> instance00202;
    
    private EList<String> instance00300;
    private EList<String> instance00301;
    private EList<String> instance00302;
    
    private EList<Integer> instance00400;
    private EList<Integer> instance00401;
    private EList<Integer> instance00402;
    
    @Test
    public void multiInstanceTest() {
        instance00000 = new EArrayList();
        instance00001 = new EArrayList<>();
        instance00002 = new EArrayList<Object>();
        instance00003 = new EArrayList<String>();
        instance00004 = new EArrayList<Integer>();
        
        instance00100 = new EArrayList();
        instance00101 = new EArrayList<>();
        instance00102 = new EArrayList<Object>();
        
        instance00200 = new EArrayList();
        instance00201 = new EArrayList<>();
        instance00202 = new EArrayList<Object>();
        
        instance00300 =  new EArrayList();
        instance00301 = new EArrayList<>();
        instance00302 = new EArrayList<String>();
        
        instance00400 =  new EArrayList();
        instance00401 = new EArrayList<>();
        instance00402 = new EArrayList<Integer>();
    }
}
