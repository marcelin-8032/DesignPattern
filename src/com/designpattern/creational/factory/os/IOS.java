package com.designpattern.creational.factory.os;

public class IOS implements IOperatingSystem{

    @Override
    public void specifications() {
        System.out.println("Most secure OS");
    }
}
