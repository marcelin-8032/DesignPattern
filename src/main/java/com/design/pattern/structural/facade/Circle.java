package com.design.pattern.structural.facade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Circle implements Shape {

    @Override
    public void draw() {
        log.info("Circle::draw()");
    }
}