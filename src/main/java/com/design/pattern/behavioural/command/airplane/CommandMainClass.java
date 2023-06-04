package com.design.pattern.behavioural.command.airplane;

import java.util.ArrayList;
import java.util.List;

public class CommandMainClass {

    public static void main(String[] args) {

        WingControls wingControls = new WingControls();
        EngineControls engineControls = new EngineControls();
        List<ICommandController> commandControllers = new ArrayList<>();
        commandControllers.add(wingControls);
        commandControllers.add(engineControls);
        Cockpit cockpit = new Cockpit(commandControllers);

        Pilot pilot = new Pilot(cockpit);
        pilot.fly();

    }
}
