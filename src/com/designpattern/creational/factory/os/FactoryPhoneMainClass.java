package com.designpattern.creational.factory.os;

public class FactoryPhoneMainClass {

    public static void main(String[] args) {
        var operatingSystemFactory=new OperatingSystemFactory();
        IOperatingSystem os=operatingSystemFactory.getOperatingSystem("IOS");
        os.specifications();
    }

}
