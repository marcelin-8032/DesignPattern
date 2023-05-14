package com.designpattern.creational.builder.restaurant;

public class CocaCola extends FreshDrink {

    public CocaCola() {
        System.out.println("Have a Coca Cola");
    }


    @Override
    public IDeliveryMode packageType() {
        return new DrinkCan();
    }

    @Override
    public String name() {
        return "Cola";
    }

    @Override
    public float price() {
        return 2.0f;
    }
}
