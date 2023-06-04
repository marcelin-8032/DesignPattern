package com.design.pattern.creational.factory.os;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Window implements IOperatingSystem {
    @Override
    public void specifications() {
        log.info("I never die, since i am adaptable..");
    }
}
