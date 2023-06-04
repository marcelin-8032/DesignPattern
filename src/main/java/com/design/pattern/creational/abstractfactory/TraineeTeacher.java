package com.design.pattern.creational.abstractfactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
 class TraineeTeacher implements Profession {
    @Override
    public void print() {
        log.info("In Print of Trainee Teacher class");
    }
}
