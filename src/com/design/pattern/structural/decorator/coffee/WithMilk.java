package com.design.pattern.structural.decorator.coffee;

public class WithMilk extends CoffeDecorator {

    Coffee coffee;

    public WithMilk(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+ " With Milk";
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.50;
    }
}
