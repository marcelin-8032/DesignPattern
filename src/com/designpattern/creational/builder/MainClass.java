package com.designpattern.creational.builder;

class MainClass {


    public static void main(String[] args) {

        var earthQuakeResistantBuilder = new EarthQuakeResistantBuilder();

        var director = new Director(earthQuakeResistantBuilder);

        director.manageRequiredHomeConstruction();
        Home homeConstructedAtTheEnd = director.getComplexObjectOfHome();

        System.out.println(homeConstructedAtTheEnd);
        System.out.println(homeConstructedAtTheEnd.floor);


    }
}
