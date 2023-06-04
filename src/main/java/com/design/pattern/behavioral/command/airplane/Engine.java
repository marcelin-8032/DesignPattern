package com.design.pattern.behavioral.command.airplane;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Engine {

    public void speedUP(){
        log.info("Speeding up the engine");
    }

    public void speedDOWN(){
        log.info("Slow down the engine");
    }
}
