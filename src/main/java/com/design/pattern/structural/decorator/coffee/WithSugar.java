package com.design.pattern.structural.decorator.coffee;

public class WithSugar extends CoffeDecorator{
    Coffee coffee;

    public WithSugar(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+ " With Sugar";
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.25;
    }
}
