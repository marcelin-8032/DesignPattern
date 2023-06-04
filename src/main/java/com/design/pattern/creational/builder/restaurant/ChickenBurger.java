package com.design.pattern.creational.builder.restaurant;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ChickenBurger extends BurgerSandwich {

    public ChickenBurger() {
        log.info("Have a Chicken Burger");
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
