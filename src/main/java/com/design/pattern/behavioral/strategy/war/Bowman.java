package com.design.pattern.behavioral.strategy.war;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Bowman extends Warrior {

    public Bowman() {
        this.iReloadable = new ReloadGun();
        this.iReloadable.reload();
    }

    @Override
    void fight() {
        for (int i = 0; i < 4; i++) {
            log.info(this.getClass().getTypeName() + " throw an arrow of the bow");
        }
    }
}
