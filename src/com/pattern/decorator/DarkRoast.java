package com.pattern.decorator;

public class DarkRoast extends Beverage {
    // this is concrete class
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double Cost() {
        return 10.00;
    }
}
