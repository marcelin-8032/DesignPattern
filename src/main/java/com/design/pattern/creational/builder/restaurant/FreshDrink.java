package com.design.pattern.creational.builder.restaurant;

public abstract class FreshDrink implements MenuItem {


    @Override
    public IDeliveryMode packageType() {
        return new DrinkCan();
    }

    @Override
    public abstract float price();
}
