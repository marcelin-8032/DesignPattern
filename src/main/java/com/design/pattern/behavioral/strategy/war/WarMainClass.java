package com.design.pattern.behavioral.strategy.war;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WarMainClass {

    public static void main(String[] args) {
        log.info("War begin");
        var shooter = new Shooter();
        shooter.fight();

        var bowMan = new Bowman();
        bowMan.fight();
        bowMan.iReloadable.reload();
    }

}
