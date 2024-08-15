package com.design.pattern.structural.flyweight.soldiergame;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class ClientConsole {

    public static void main(String[] args) {

        // Creating and rendering soldiers with shared attributes
        var soldier1 = SoldierFactory.getSoldier("Sergeant", "Heavy Armor", "Rifle");
        log.info("" + soldier1);
        soldier1.render(10, 20, 100);

        var soldier2 = SoldierFactory.getSoldier("Corporal", "Light Armor", "Sniper Rifle");
        soldier2.render(30, 40, 80);

        var soldier3 = SoldierFactory.getSoldier("Sergeant", "Heavy Armor", "Rifle"); // Reuses the same Sergeant type
        soldier3.render(50, 60, 90);

        var soldier4 = SoldierFactory.getSoldier("Corporal", "Light Armor", "Sniper Rifle"); // Reuses the same Corporal type
        soldier4.render(70, 80, 60);
    }
}
