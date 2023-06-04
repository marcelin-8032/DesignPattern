package com.design.pattern.creational.prototype.profession;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class Engineer extends Profession {
    @Override
    public void print() {
        log.info("In print Engineer class");
    }


}
