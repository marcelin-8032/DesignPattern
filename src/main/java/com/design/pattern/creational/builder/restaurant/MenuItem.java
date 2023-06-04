package com.design.pattern.creational.builder.restaurant;

public interface MenuItem {

    IDeliveryMode packageType();

    String name();

    float price();

}
