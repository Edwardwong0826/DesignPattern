package com.pattern.iterator;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DinerMenuIterator implements Iterator<List> {
    List<String> list = new ArrayList<String>();
    int position = 0;
    public DinerMenuIterator (List<String> list){
        this.list = list;
    }
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public List next() {
        return null;
    }
}
