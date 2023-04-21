package com.mjr.code.tools.util;

import java.util.List;

public abstract interface EList<E extends Object> extends List<E>{
    public abstract EArrayList sort();
}
