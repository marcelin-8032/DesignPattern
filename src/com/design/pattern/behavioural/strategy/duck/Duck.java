package com.design.pattern.behavioural.strategy.duck;

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
