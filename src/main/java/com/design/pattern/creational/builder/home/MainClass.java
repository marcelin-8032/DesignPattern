package com.design.pattern.creational.builder.home;

class MainClass {


    public static void main(String[] args) {

        var earthQuakeResistantBuilder = new EarthQuakeResistantBuilder();

        var director = new Director(earthQuakeResistantBuilder);

        director.manageRequiredHomeConstruction();
        Home homeConstructedAtTheEnd = director.getComplexObjectOfHome();

        System.out.println(homeConstructedAtTheEnd);
        System.out.println(homeConstructedAtTheEnd.floor);


        var floodResistantBuilder=new FloodResistantBuilder();
        var director2=new Director(floodResistantBuilder);

        director2.manageRequiredHomeConstruction();
        Home floodResistantHome=director2.getComplexObjectOfHome();

        System.out.println(floodResistantHome);
        System.out.println(floodResistantHome.floor);



    }
}
