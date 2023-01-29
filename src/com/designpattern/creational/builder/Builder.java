package com.designpattern.creational.builder;

public interface Builder {


    void buildFloor();

    void buildWalls();

    void buildTerrace();

    Home getComplexHomeObject();


}
