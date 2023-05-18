package com.designpattern.behavioural.strategy.war;

public class ReloadGun implements IReloadable {


    @Override
    public void reload() {
        System.out.println(this.getClass().getTypeName() + "> reload gun");
    }
}
