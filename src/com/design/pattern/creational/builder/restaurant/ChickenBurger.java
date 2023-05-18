package com.design.pattern.creational.builder.restaurant;

public class ChickenBurger extends BurgerSandwich {

    public ChickenBurger() {
        System.out.println("Have a Chicken Burger");
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 5.5f;
    }
}
