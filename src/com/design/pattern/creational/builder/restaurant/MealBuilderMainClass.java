package com.design.pattern.creational.builder.restaurant;

public class MealBuilderMainClass {


    public static void main(String[] args) {

        var mealBuilder = new MealBuilder();

        Meal cheeseBurger = mealBuilder.prepareCheeseBurger();
        Meal chickenBurger = mealBuilder.prepareChickenBurger();

        System.out.println("CheeseBurger");
        cheeseBurger.showItem();
        System.out.println("Total command cheeseBurger: " + cheeseBurger.getCost());

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("******** next ****** next *******");
        System.out.println("");

        System.out.println( "chickenBurger" );
        chickenBurger.showItem();
        System.out.println( "Total command chickenBurger : " + chickenBurger.getCost() );


    }

}
