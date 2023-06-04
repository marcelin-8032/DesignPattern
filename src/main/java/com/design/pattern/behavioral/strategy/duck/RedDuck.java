package com.design.pattern.behavioral.strategy.duck;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RedDuck extends Duck{


    public RedDuck(FlyBehaviour flyBehaviour) {
        super(flyBehaviour);
    }

    @Override
    public void swim() {
        log.info("I am swing both under and surface of water");
    }
}
