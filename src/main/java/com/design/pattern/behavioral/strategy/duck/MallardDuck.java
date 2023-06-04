package com.design.pattern.behavioral.strategy.duck;

import lombok.extern.slf4j.Slf4j;

@Slf4j
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
        log.info("I am swimming under water");
    }
}
