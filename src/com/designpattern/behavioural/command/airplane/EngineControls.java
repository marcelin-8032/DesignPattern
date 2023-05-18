package com.designpattern.behavioural.command.airplane;

public class EngineControls implements ICommandController {

    private Engine engine;

    public static final String SPEED_UP = "SPEED_UP";

    public static final String SLOW_DOWN = "SLOW_DOWN";

    public EngineControls() {
        this.engine = new Engine();
    }

    @Override
    public void execute(String command) {
        switch (command) {
            case SPEED_UP -> {
                engine.speedUP();
            }
            case SLOW_DOWN -> {
                engine.speedDOWN();
            }
            default -> {
                System.out.println("Sorry I did not understand the command");
            }

        }
    }

    @Override
    public boolean canHandle(String command) {
        return SPEED_UP.equals(command) || SLOW_DOWN.equals(command);
    }
}
