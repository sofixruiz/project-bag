package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bag<T> implements Container{

    private ArrayList<T> list;
    private int n = 0;

    public Bag() {
        this.list = new ArrayList<T>();
    }

    @Override
    public boolean isEmpty() {
        return list.size() == 0;
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public void add(Object item) {
        list.add((T) item);
        n++;
    }

    @Override
    public Iterator iterator() {
        return list.iterator();
    }
}
