package com.design.pattern.behavioural.strategy.duck;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I'm Flying!!!");
    }
}
