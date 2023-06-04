package com.design.pattern.structural.bridge.device;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BridgeDemo {


    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    private static void testDevice(Device device) {
        log.info("Tests with basic remote.");
        var basicRemote=new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        log.info("Tests with advanced remote.");
        var advancedRemote=new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();

    }


}
