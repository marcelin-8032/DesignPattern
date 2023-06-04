package com.design.pattern.creational.builder.phone;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ShopMainClass {


    public static void main(String[] args) {

        Phone p = new PhoneBuilder().setOs("Android")
                .setBattery(3100)
                .setRam(4)
                .setScreenSize(5.2)
                .setProcessor("Snapdragon 8 Gen 2")
                .getPhone();
        log.info("p: ", p);
    }
}
