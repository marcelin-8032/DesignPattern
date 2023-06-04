package com.design.pattern.creational.builder.restaurant;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DrinkCan implements IDeliveryMode {


    public DrinkCan() {
        log.info("Have a Drink Can");
    }

    @Override
    public String packaging() {
        return "DrinkCan";
    }
}
