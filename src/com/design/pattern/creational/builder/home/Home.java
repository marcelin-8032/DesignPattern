package com.design.pattern.creational.builder.home;

class Home {

    String floor;
    String walls;
    String terrace;

    @Override
    public String toString() {
        return "Home{" +
                "floor='" + floor + '\'' +
                ", walls='" + walls + '\'' +
                ", terrace='" + terrace + '\'' +
                '}';
    }
}
