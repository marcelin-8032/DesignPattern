package com.designpattern.creational.builder.restaurant;

public class CheeseBurger extends BurgerSandwich {


    public CheeseBurger() {
        System.out.println("Have a Cheese Berger");
    }

    @Override
    public String name() {
        return "Cheese Burger";
    }

    @Override
    public float price() {
        return 4.4f;
    }
}
