package com.design.pattern.structural.decorator.coffee;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Espresso extends Coffee {


    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }

    public static void main(String[] args) {
        Espresso espresso=new Espresso();
        log.info("espresso: ", espresso);
    }

}
