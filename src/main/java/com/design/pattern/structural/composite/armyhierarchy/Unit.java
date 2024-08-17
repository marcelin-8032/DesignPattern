package com.design.pattern.structural.composite.armyhierarchy;

import lombok.AllArgsConstructor;

@AllArgsConstructor
abstract class Unit {

    protected String name;

    abstract void showDetails();
}
