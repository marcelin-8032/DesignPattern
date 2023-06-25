package com.design.pattern.structural.adapter.tank;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;

@Slf4j
public class EnemyTank implements EnemyAttacker {

    Random random = new Random();

    @Override
    public void fireWeapon() {
        int attackDamage = random.nextInt(10) + 1;
        log.info("Enemy Tank Does " + attackDamage + " Damage");
    }

    @Override
    public void driveForward() {
        int movement = random.nextInt(5) + 1;
        log.info("Enemy Tank moves " + movement + " spaces");

    }

    @Override
    public void assignDriver(String driver) {
        log.info(driver + " is driving the tank");

    }
}
