package com.designpattern.creational.builder.restaurant;

public interface MenuItem {

    IDeliveryMode packageType();

    String name();

    float price();

}
