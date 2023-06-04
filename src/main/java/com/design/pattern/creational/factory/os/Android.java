package com.design.pattern.creational.factory.os;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Android implements IOperatingSystem{

    @Override
    public void specifications() {
        log.info("Most Powerfull OS");
    }
}
