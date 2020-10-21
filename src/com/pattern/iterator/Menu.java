package com.pattern.iterator;

import java.awt.*;
import java.util.Iterator;

public interface Menu {

    public abstract Iterator<MenuItem> createIterator();
}
