package com.design.pattern.structural.composite.armyhierarchy;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Soldier extends Unit {

    Soldier(String name) {
        super(name);
    }

    @Override
    void showDetails() {
        log.info("Soldier: " + name);
    }
}
