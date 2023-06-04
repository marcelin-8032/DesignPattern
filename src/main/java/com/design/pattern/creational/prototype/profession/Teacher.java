package com.design.pattern.creational.prototype.profession;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class Teacher extends Profession {
    @Override
    public void print() {
        log.info("In print Teacher class");
    }

}
