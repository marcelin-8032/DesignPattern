package com.design.pattern.behavioral.strategy.war;

public class Shooter extends Warrior {

    public Shooter() {
        this.iReloadable = new ReloadGun();
        this.iReloadable.reload();
    }
}
