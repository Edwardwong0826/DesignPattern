package com.pattern.decorator;

public abstract class Beverage {

    String description = "Unknown Description";

    public String getDescription(){
        return description;
    }

    public abstract double Cost();

}
