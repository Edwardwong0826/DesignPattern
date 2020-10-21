package com.pattern.decorator;

public class Whip extends CondimentDecorator{
    // this is the concrete decorator class
    Beverage beverage; // super class of both beverage and decorator class

    public Whip (Beverage beverage){
        this.beverage = beverage;
    }


   public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    // get the wrapping class cost to add the own condiment cost
    @Override
    public double Cost() {
        return beverage.Cost() + 5;
    }
}
