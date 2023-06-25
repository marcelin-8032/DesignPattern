package com.design.pattern.structural.adapter.tank;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;

@Slf4j
public class EnemyRobot {

    Random generator = new Random();

    void smashWithHand() {
        int attachDamage = generator.nextInt(10) + 1;
        log.info("Enemy Robot causes " + attachDamage + " Damages With Its");
    }


    void walkForward() {
        int movement = generator.nextInt(5) + 1;
        log.info("Enemy Robot walks forward " + movement + " Spaces");
    }

    void reactToHuman(String driverName) {
        log.info("Enemy tramps on " + driverName);
    }


    @Override
    public String toString() {
        return "EnemyRobot{}";
    }
}
