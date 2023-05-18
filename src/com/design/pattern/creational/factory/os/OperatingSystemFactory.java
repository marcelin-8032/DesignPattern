package com.design.pattern.creational.factory.os;

public class OperatingSystemFactory {


    public IOperatingSystem getOperatingSystem(String typeOfOS) {

        if (typeOfOS == null) {
            return null;
        }
        if (typeOfOS.equalsIgnoreCase("Android")) {
            return new Android();
        } else if (typeOfOS.equalsIgnoreCase("IOS")) {
            return new IOS();
        } else if (typeOfOS.equalsIgnoreCase("Windows")) {
            return new Window();
        }
        return null;
    }

}
