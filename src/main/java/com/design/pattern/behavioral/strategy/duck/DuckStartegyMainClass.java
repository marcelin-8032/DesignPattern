package com.design.pattern.behavioral.strategy.duck;

public class DuckStartegyMainClass {

    public static void main(String[] args) {
        FlyBehaviour flyWithWings=new FlyWithWings();
        Duck mallardDuck=new MallardDuck(flyWithWings);

        mallardDuck.performFly();
    }
}
