package com.designpattern.creational.builder.phone;

public class ShopMainClass {


    public static void main(String[] args) {

        Phone p=new PhoneBuilder().setOs("Android")
                .setBattery(3100)
                .setRam(4)
                .setScreenSize(5.2)
                .setProcessor("Snapdragon 8 Gen 2")
                .getPhone();
        System.out.println(p);
    }
}
