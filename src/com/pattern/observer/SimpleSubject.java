package com.pattern.observer;

import java.util.ArrayList;

public class SimpleSubject implements Subject{

    // Subject provide register and remove function to any object that wishes to act as observer get the
    // values, once get update the value it will immediately notify all observer the new value update
    // it does not care who is register , it just provide the value to who observer is subscribe

    private ArrayList<Observer> observers;
    private int value = 0;

    public SimpleSubject()
    {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o)
    {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o)
    {
        observers.remove(o);
    }

    @Override
    public void notifyObserver()
    {
        observers.stream().forEach(o -> o.update(value));
    }

    public void setValue(int value)
    {
        this.value = value;
        notifyObserver();
    }
}
