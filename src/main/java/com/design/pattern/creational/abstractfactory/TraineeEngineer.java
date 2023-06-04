package com.design.pattern.creational.abstractfactory;


import lombok.extern.slf4j.Slf4j;

@Slf4j
 class TraineeEngineer implements Profession {
    @Override
    public void print() {
        log.info("In Print of Trainee Engineer class");
    }
}
