package com.design.pattern.creational.builder.restaurant;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MealBuilderMainClass {


    public static void main(String[] args) {

        var mealBuilder = new MealBuilder();

        Meal cheeseBurger = mealBuilder.prepareCheeseBurger();
        Meal chickenBurger = mealBuilder.prepareChickenBurger();

        log.info("CheeseBurger");
        cheeseBurger.showItem();
        log.info("Total command cheeseBurger: " + cheeseBurger.getCost());

        log.info("");
        log.info("");
        log.info("");
        log.info("******** next ****** next *******");
        log.info("");

        log.info( "chickenBurger" );
        chickenBurger.showItem();
        log.info( "Total command chickenBurger : " + chickenBurger.getCost() );


    }

}
