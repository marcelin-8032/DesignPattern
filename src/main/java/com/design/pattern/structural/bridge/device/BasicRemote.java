package com.design.pattern.structural.bridge.device;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BasicRemote implements Remote {

    protected Device device;

    public BasicRemote() {
    }

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        log.info("Remote: power toggle");
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }

    }

    @Override
    public void volumeDown() {
        log.info("Remote: volume down");
        device.setVolume(device.getVolume() - 10);
    }

    @Override
    public void volumeUp() {
        log.info("Remote: volume up");
        device.setVolume(device.getVolume() + 10);
    }

    @Override
    public void channelDown() {
        log.info("Remote: channel down");
        device.setVolume(device.getChannel() - 1);
    }

    @Override
    public void channelUp() {
        log.info("Remote: channel up");
        device.setVolume(device.getChannel() + 1);
    }
}
