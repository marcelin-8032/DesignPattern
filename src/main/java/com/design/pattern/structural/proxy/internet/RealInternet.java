package com.design.pattern.structural.proxy.internet;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RealInternet implements Internet {

    @Override
    public void connectTo(String serverHost) throws Exception {
        log.info("Connecting to: " + serverHost);
    }
}
