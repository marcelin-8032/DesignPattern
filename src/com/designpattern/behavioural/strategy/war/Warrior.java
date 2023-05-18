package com.designpattern.behavioural.strategy.war;

public class Warrior {

    IReloadable iReloadable;

    public Warrior() {
    }

    void fight() {
        System.out.println(this.getClass().getTypeName() + ": fight like Warrior");
    }
}
