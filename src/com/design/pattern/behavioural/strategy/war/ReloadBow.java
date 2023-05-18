package com.design.pattern.behavioural.strategy.war;

public class ReloadBow implements IReloadable {
    @Override
    public void reload() {
        System.out.println(this.getClass().getTypeName()+"> take an arrow and place it in the bow");
    }
}
