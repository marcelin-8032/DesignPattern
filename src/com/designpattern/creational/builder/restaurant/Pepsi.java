package com.designpattern.creational.builder.restaurant;

public class Pepsi extends FreshDrink {

    public Pepsi() {
        System.out.println("Have a Pepsi");
    }

    @Override
    public IDeliveryMode packageType() {
        return new DrinkCan();
    }

    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 1.5f;
    }
}
