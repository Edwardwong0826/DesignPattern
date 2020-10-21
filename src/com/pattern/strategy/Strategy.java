package com.pattern.strategy;

public abstract class Strategy {

    // In Strategy pattern we separate those varying method that to interface
    // what is varying? some subclasses have to use or some subclasses does not have use at all
    // if we sure one method that are every subclasses is gonna to use, then we do not need to separate out
    // this make us instead relying on specific implementation of quack
    // and fly, we now relying the interface on the Strategy class to have the flexibility to change
    // the duck does not need to know of how specific behaviors are implemented

    // the behavior are separated to the duck, as not directly implements the interface
    // this is has - a relationship , a composition

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    abstract void display();

    public Strategy()
    {
    }

    public void performFly()
    {
        flyBehavior.fly();
    }

    public void performQuack()
    {
        quackBehavior.Quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior)
    {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior)
    {
        this.quackBehavior = quackBehavior;
    }

    public void swim()
    {
        System.out.println("All duck are float!");
    }
}
