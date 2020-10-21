package com.pattern.decorator;

public class StarbuzzCoffee {
    public static void main(String[] args)
    {

        //we passed the beverage to create Whip decorator, the decorator are composed
        //with beverages. The base beverage is wrap with the condiments, and in the end , get back
        // all decorator cost and description.

        Beverage beverage = new DarkRoast();
        beverage = new Whip(beverage);
        beverage = new Whip(beverage); // when passed the Whip decorator, will get back whip decorated bevarage
        System.out.println(beverage.getDescription()+ " $" + beverage.Cost());

    }
}
