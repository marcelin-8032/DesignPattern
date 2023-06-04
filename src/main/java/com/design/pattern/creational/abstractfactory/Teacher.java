package com.design.pattern.creational.abstractfactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
 class Teacher implements Profession {
    @Override
    public void print() {
        log.info("In print Teacher class");
    }
}
