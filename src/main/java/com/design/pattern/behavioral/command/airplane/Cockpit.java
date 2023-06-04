package com.design.pattern.behavioral.command.airplane;

import lombok.extern.slf4j.Slf4j;

import java.util.Iterator;
import java.util.List;

@Slf4j
public class Cockpit implements ICommandController {

    public static final String TAKE_OFF = "TAKE_OFF";
    public static final String LAND = "LAND";
    public static final String REACH_ALTITUDE = "REACH_ALTITUDE";
    public static final String EXIT = "EXIT";

    private List<ICommandController> commandController;

    public Cockpit(List<ICommandController> commandController) {
        commandController.add(this);
        this.commandController = commandController;
    }

    @Override
    public void execute(String command) {
        Iterator<ICommandController> commandControllerIterator=this.commandController.iterator();
        while (commandControllerIterator.hasNext()){
            ICommandController commandController1=commandControllerIterator.next();

            if(commandController1 instanceof Cockpit){
                switch (command){
                    case Cockpit.TAKE_OFF -> {
                        this.takeOff();
                    }
                    case Cockpit.LAND -> {
                        this.land();
                    }
                    case Cockpit.REACH_ALTITUDE ->
                        this.reachAltitudeAndFly();

                    case Cockpit.EXIT ->
                        System.exit(1);
                }
            } else if (commandController1.canHandle(command)) {
                commandController1.execute(command);
            }
        }
    }

    @Override
    public boolean canHandle(String command) {
        return TAKE_OFF.equals(command) ||
                LAND.equals(command) ||
                REACH_ALTITUDE.equals(command) ||
                EXIT.equals(command);
    }

    private void takeOff() {
        log.info("Fligh Take Off operations---------");
        this.execute(EngineControls.SPEED_UP);
        this.execute(WingControls.MOVE_UP);
        log.info("---------");
    }

    private void reachAltitudeAndFly() {
        log.info("Flying at an altitue---------");
        this.execute(EngineControls.SPEED_UP);
        this.execute(WingControls.KEEP_FLAT);
        log.info("---------");
    }

    private void land() {
        log.info("Landing the Flight----------");
        this.execute(EngineControls.SLOW_DOWN);
        this.execute(WingControls.MOVE_DOWN);
        log.info("---------");
    }

}
