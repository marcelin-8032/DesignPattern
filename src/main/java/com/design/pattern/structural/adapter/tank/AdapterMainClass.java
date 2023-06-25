package com.design.pattern.structural.adapter.tank;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AdapterMainClass {


    public static void main(String[] args) {
        EnemyTank enemyTank = new EnemyTank();
        EnemyRobot enemyRobot = new EnemyRobot();
        EnemyAttacker enemyRobotAdapter = new EnemyRobotAdapter(enemyRobot);
        log.info("------------------------------------");
        log.info("The enemy robot");
        enemyRobot.reactToHuman("Paul");
        enemyRobot.walkForward();
        enemyRobot.smashWithHand();

        log.info("------------------------------------");
        log.info("The Enemy Tank");
        enemyTank.assignDriver("Frank");
        enemyTank.driveForward();
        enemyTank.fireWeapon();
        log.info("------------------------------------");
        log.info("The robot with the Adapter");
        enemyRobotAdapter.assignDriver("Mark");
        enemyRobotAdapter.driveForward();
        enemyRobotAdapter.fireWeapon();


    }
}
