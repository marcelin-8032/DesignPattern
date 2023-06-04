package com.design.pattern.creational.abstractfactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
 class Engineer implements Profession {
    @Override
    public void print() {
        log.info("In print Engineer class");
    }
}
