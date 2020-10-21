package com.pattern.strategy;

public class Squeak implements QuackBehavior {
    @Override
    public void Quack()
    {
        System.out.println("Squeak");
    }
}
