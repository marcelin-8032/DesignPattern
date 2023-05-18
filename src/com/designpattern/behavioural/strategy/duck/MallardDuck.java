package com.designpattern.behavioural.strategy.duck;

public class MallardDuck extends Duck{

    public MallardDuck(FlyBehaviour flyBehaviour) {
        super(flyBehaviour);
    }

    @Override
    public void performFly() {
       flyBehaviour.fly();
    }

    @Override
    public void swim() {
        System.out.println("I am swimming under water");
    }
}
