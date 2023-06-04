package com.design.pattern.creational.builder.restaurant;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CocaCola extends FreshDrink {

    public CocaCola() {
        log.info("Have a Coca Cola");
    }


    @Override
    public IDeliveryMode packageType() {
        return new DrinkCan();
    }

    @Override
    public String name() {
        return "Cola";
    }

    @Override
    public float price() {
        return 2.0f;
    }
}
