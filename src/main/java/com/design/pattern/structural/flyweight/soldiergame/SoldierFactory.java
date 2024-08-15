package com.design.pattern.structural.flyweight.soldiergame;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
class SoldierFactory {

    private static final Map<String, Soldier> soldierMap = new HashMap<>();

    public static Soldier getSoldier(String rank, String armor, String weapon) {
        var key = rank + "-" + armor + "-" + weapon;
        var soldier = soldierMap.get(key);

        if (soldier == null) {
            soldier = new SoldierType(rank, armor, weapon);
            soldierMap.put(key, soldier);
            log.info("Creating a new soldier type: " + key);
        }
        return soldier;
    }
}
