package com.design.pattern.behavioral.strategy.duck;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        log.info("I'm Flying!!!");
    }
}
