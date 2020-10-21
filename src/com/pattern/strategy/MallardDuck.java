package com.pattern.strategy;

public class MallardDuck extends Strategy{

    public MallardDuck()
    {
        // program to an interface rather then implementation
        // in the concrete class we can define the interface with the behavior we want or use the super
        // class to set the behavior

        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    void display()
    {
        System.out.println("I'm a Mallard Duck");
    }

    public static void main(String[] args)
    {
        Strategy mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
    }
}
