package com.design.pattern.structural.composite.armyhierarchy;

import com.design.pattern.structural.composite.armyhierarchy.Unit;

import java.util.ArrayList;
import java.util.List;

class General extends Unit {

    private List<Unit> subordinates;

    public General(String name) {
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
        System.out.println("General: " + name);
        for (Unit unit : subordinates) {
            unit.showDetails();
        }
    }
}
