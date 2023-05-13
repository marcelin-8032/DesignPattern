package com.designpattern.creational.builder.home;

class FloodResistantBuilder implements IHomeBuilder {

    private Home earthquakeResistantHome = new Home();

    @Override
    public void buildFloor() {
        this.earthquakeResistantHome.floor = "10 feets Above ground level floor";
    }

    @Override
    public void buildWalls() {
        this.earthquakeResistantHome.walls = "Water resistant walls";
    }

    @Override
    public void buildTerrace() {
        this.earthquakeResistantHome.terrace = "Water leakage resistant terrace";
    }

    @Override
    public Home getComplexHomeObject() {
        return this.earthquakeResistantHome;
    }
}
