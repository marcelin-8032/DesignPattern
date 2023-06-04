package com.design.pattern.behavioural.strategy.war;

public class Bowman extends Warrior {

    public Bowman() {
        this.iReloadable = new ReloadGun();
        this.iReloadable.reload();
    }

    @Override
    void fight() {
        for (int i = 0; i < 4; i++) {
            System.out.println(this.getClass().getTypeName() + " throw an arrow of the bow");
        }
    }
}
