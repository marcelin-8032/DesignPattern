package com.design.pattern.structural.composite.armyhierarchy;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
class Sergeant extends Unit {

    private List<Unit> subordinates;

    public Sergeant(String name) {
        super(name);
        this.subordinates = new ArrayList<>();
    }

    public void add(Unit unit) {
        subordinates.add(unit);
    }

    public void remove(Unit unit) {
        subordinates.remove(unit);
    }

    @Override
    public void showDetails() {
        log.info("Sergeant: " + name);
        for (Unit unit : subordinates) {
            unit.showDetails();
        }
    }
}
