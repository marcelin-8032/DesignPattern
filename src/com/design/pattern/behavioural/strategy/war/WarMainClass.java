package com.design.pattern.behavioural.strategy.war;

public class WarMainClass {

    public static void main(String[] args) {
        System.out.println("War begin");
        var shooter = new Shooter();
        shooter.fight();

        var bowMan = new Bowman();
        bowMan.fight();
        bowMan.iReloadable.reload();
    }

}
