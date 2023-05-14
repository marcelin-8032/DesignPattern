package com.designpattern.creational.builder.restaurant;

public class DisposablePackaging implements IDeliveryMode {

    public DisposablePackaging() {
        System.out.println("Have a disposable Package");
    }

    @Override
    public String packaging() {
        return "Package the disposable Package";
    }
}
