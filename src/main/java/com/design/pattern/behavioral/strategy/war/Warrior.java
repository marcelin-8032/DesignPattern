package com.design.pattern.behavioral.strategy.war;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Warrior {

    IReloadable iReloadable;

    public Warrior() {
    }

    void fight() {
        log.info(this.getClass().getTypeName() + ": fight like Warrior");
    }
}
