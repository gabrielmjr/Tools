package com.gabrielmjr.tools.util;

import java.util.List;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public class EArrayList<E extends Object> implements EList<E> {
    private Collection<E> values;
    
    @Override
    public int size() {
       return values.size(); 
    }
    
    @Override
    public boolean isEmpty() {
        return values.isEmpty();
    }

    @Override
    public boolean contains(Object value) {
        return values.contains(value);
    }

    @Override
    public Iterator iterator() {
        return values.iterator();
    }

    @Override
    public Object[] toArray() {
        return values.toArray();
    }
    
    @Override
    public <T extends Object> T[] toArray(T[] values) {
        return this.values.toArray(values);
    }

    @Override
    public boolean add(E value) {
        return values.add(value);
    }

    @Override
    public boolean remove(Object value) {
        return values.remove(value);
    }

    @Override
    public boolean containsAll(Collection<?> value) {
        return values.containsAll(value);
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        return values.addAll(collection);
    }

    @Override
    public boolean addAll(int position, Collection collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return values.removeAll(collection);
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return values.retainAll(collection);
    }

    @Override
    public void clear() {
        values.clear();
    }

    @Override
    public E get(int position) {
        return (E)values.toArray()[position];
    }

    @Override
    public E set(int position, Object object) {
        return null;
    }

    @Override
    public void add(int position, Object object) {
    }

    @Override
    public E remove(int position) {
        return null;
    }

    @Override
    public int indexOf(Object object) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object object) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int position) {
        return null;
    }

    @Override
    public List subList(int p1, int p2) {
        return null;
    }

    @Override
    public EArrayList sort() {
        return null;
    }
}
