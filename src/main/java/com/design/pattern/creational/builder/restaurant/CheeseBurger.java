package com.design.pattern.creational.builder.restaurant;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CheeseBurger extends BurgerSandwich {


    public CheeseBurger() {
        log.info("Have a Cheese Berger");
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
