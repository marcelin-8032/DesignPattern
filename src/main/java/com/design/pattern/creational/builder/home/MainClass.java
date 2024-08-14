package com.design.pattern.creational.builder.home;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class MainClass {


    public static void main(String[] args) {

        var earthQuakeResistantBuilder = new EarthQuakeResistantBuilder();

        var director = new Director(earthQuakeResistantBuilder);

        director.manageRequiredHomeConstruction();
        Home homeConstructedAtTheEnd = director.getComplexObjectOfHome();

        log.info("homeConstructedAtTheEnd: ", homeConstructedAtTheEnd);
        log.info(homeConstructedAtTheEnd.floor);


        var floodResistantBuilder=new FloodResistantBuilder();
        var director2=new Director(floodResistantBuilder);

        director2.manageRequiredHomeConstruction();
        Home floodResistantHome=director2.getComplexObjectOfHome();

        log.info("floodResistantHome: ", floodResistantHome);
        log.info(floodResistantHome.floor);

    }
}
