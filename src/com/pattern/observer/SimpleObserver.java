package com.pattern.observer;

public class SimpleObserver implements Observer {

    // observer get the new value once the Subject update, it can register itself to Subject or
    // remove itself Subject anytime

    private int value;
    private Subject simpleSubject;


    public SimpleObserver(Subject simpleSubject)
    {
        this.simpleSubject = simpleSubject;
        simpleSubject.registerObserver(this);
    }

    @Override
    public void update(int values)
    {
        this.value = values;
        display();
    }

    public void display()
    {
        System.out.println("Value: " + value);
    }


}
