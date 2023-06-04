package com.design.pattern.creational.factory.os;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IOS implements IOperatingSystem{

    @Override
    public void specifications() {
        log.info("Most secure OS");
    }
}
