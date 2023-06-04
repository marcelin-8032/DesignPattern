package com.design.pattern.creational.builder.restaurant;

public class MealBuilder {

    public MealBuilder() {
        System.out.println("Have a Meal Builder");
    }


    public Meal prepareCheeseBurger() {
        var meal = new Meal();
        meal.addItem(new CheeseBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

    public Meal prepareChickenBurger(){
        var meal=new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new CocaCola());
        return meal;
    }

}
