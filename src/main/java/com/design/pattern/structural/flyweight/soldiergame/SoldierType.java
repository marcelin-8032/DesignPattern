package com.design.pattern.structural.flyweight.soldiergame;

import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Slf4j
@ToString
class SoldierType implements Soldier{

    private final String rank;
    private final String armor;
    private final String weapon;

    @Override
    public void render(int x, int y, int health) {
       log.info(rank + " soldier with " + armor + " armor and " + weapon + " weapon at (" + x + ", " + y + ") with health " + health);
    }
}
