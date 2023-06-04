package com.design.pattern.structural.decorator.coffee;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CoffeMainClass {


    public static void main(String[] args) {
        Coffee espresso = new Espresso();

        espresso = new WithSugar(espresso);
       // espresso = new WithMilk(espresso);
        printCoffee(espresso);
    }

    private static void printCoffee(Coffee coffee) {

        log.info("Cost: " + coffee.cost() +
                " Description: " + coffee.getDescription());
    }
}
