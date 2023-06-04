package com.design.pattern.behavioral.command.airplane;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Wings {

    void moveUP(){
        log.info("Flight moving upwards");
    }

    void moveDown(){
        log.info("Flight moving downwards");
    }

    void keepFlat(){
        log.info("Flying flat");
    }

    void turnLeft(){
        log.info("Turn Left");
    }

    void turnRight(){
        log.info("Turn Right");
    }

}
