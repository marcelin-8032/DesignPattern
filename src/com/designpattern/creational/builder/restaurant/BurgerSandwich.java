package com.designpattern.creational.builder.restaurant;

public abstract class BurgerSandwich implements MenuItem {

    @Override
    public IDeliveryMode packageType() {
        return new DisposablePackaging();
    }
}
