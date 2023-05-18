package com.design.pattern.creational.builder.home;


class Director {

    private IHomeBuilder builder;

    public Director(IHomeBuilder builderType) {
        this.builder = builderType;
    }

    public Home getComplexObjectOfHome() {
        return this.builder.getComplexHomeObject();
    }

    public void manageRequiredHomeConstruction() {
        this.builder.buildFloor();
        this.builder.buildWalls();
        this.builder.buildTerrace();
    }

}
