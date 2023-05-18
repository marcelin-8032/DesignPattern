package com.design.pattern.behavioural.strategy.war;

public class Shooter extends Warrior {

    public Shooter() {
        this.iReloadable = new ReloadGun();
        this.iReloadable.reload();
    }
}
