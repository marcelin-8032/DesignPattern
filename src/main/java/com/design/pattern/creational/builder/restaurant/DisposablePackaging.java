package com.design.pattern.creational.builder.restaurant;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DisposablePackaging implements IDeliveryMode {

    public DisposablePackaging() {
        log.info("Have a disposable Package");
    }

    @Override
    public String packaging() {
        return "Package the disposable Package";
    }
}
