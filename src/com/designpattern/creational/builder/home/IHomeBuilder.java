package com.designpattern.creational.builder.home;



public interface IHomeBuilder {

    void buildFloor();

    void buildWalls();

    void buildTerrace();

    Home getComplexHomeObject();

}
