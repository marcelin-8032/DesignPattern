package com.design.pattern.creational.builder.restaurant;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Pepsi extends FreshDrink {

    public Pepsi() {
        log.info("Have a Pepsi");
    }

    @Override
    public IDeliveryMode packageType() {
        return new DrinkCan();
    }

    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 1.5f;
    }
}
