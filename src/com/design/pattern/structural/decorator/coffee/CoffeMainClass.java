package com.design.pattern.structural.decorator.coffee;

public class CoffeMainClass {


    public static void main(String[] args) {
        Coffee espresso = new Espresso();

        espresso = new WithSugar(espresso);
       // espresso = new WithMilk(espresso);
        printCoffee(espresso);
    }

    private static void printCoffee(Coffee coffee) {

        System.out.println("Cost: " + coffee.cost() +
                " Description: " + coffee.getDescription());
    }
}
