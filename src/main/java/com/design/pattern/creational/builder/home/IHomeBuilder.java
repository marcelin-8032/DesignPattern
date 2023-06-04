package com.design.pattern.creational.builder.home;



public interface IHomeBuilder {

    void buildFloor();

    void buildWalls();

    void buildTerrace();

    Home getComplexHomeObject();

}
