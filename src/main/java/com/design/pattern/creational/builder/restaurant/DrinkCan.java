package com.design.pattern.creational.builder.restaurant;

public class DrinkCan implements IDeliveryMode {


    public DrinkCan() {
        System.out.println("Have a Drink Can");
    }

    @Override
    public String packaging() {
        return "DrinkCan";
    }
}
