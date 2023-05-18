package com.designpattern.behavioral.strategy.duck;

public class RedDuck extends Duck{


    public RedDuck(FlyBehaviour flyBehaviour) {
        super(flyBehaviour);
    }

    @Override
    public void swim() {
        System.out.println("I am swing both under and surface of water");
    }
}
