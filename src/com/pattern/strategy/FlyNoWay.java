package com.pattern.strategy;

public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly()
    {
        System.out.println("Not fly!");
    }
}
