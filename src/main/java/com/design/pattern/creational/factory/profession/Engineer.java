package com.design.pattern.creational.factory.profession;

import lombok.extern.slf4j.Slf4j;

@Slf4j
 class Engineer implements IProfession {
    @Override
    public void print() {
        log.info("In print Engineer class");
    }
}
