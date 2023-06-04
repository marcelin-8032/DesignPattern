package com.design.pattern.behavioral.command.airplane;

public class Wings {

    void moveUP(){
        System.out.println("Flight moving upwards");
    }

    void moveDown(){
        System.out.println("Flight moving downwards");
    }

    void keepFlat(){
        System.out.println("Flying flat");
    }

    void turnLeft(){
        System.out.println("Turn Left");
    }

    void turnRight(){
        System.out.println("Turn Right");
    }

}
