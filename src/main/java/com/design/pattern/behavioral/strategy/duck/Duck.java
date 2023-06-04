package com.design.pattern.behavioral.strategy.duck;

public abstract class Duck {

    protected FlyBehaviour flyBehaviour;

    public Duck(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void performFly(){
        flyBehaviour.fly();
    }

    public abstract void swim();

}
