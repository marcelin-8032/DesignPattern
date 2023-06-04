package com.design.pattern.structural.bridge.device;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super(device);
    }

    void mute() {
        log.info("Remote: mute");
        device.setVolume(0);
    }


}
