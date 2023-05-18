package com.designpattern.behavioural.command.airplane;

public class WingControls implements ICommandController {

    private Wings wings;

    public static final String MOVE_UP = "MOVE_UP";
    public static final String MOVE_DOWN = "MOVE_DOWN";
    public static final String KEEP_FLAT = "KEEP_FLAT";
    public static final String TURN_LEFT = "TURN_LEFT";
    public static final String TURN_RIGHT = "TURN_RIGHT";

    public WingControls() {
        this.wings = new Wings();
    }

    @Override
    public void execute(String command) {
        switch (command) {
            case MOVE_UP -> {
                wings.moveUP();
            }
            case MOVE_DOWN -> {
                wings.moveDown();
            }
            case KEEP_FLAT -> {
                wings.keepFlat();
            }
            case TURN_RIGHT -> {
                wings.turnRight();
            }
            case TURN_LEFT -> {
                wings.turnLeft();
            }
            default -> {
                System.out.println("Sorry i did not understand the wing operaion command");
            }
        }
    }

    @Override
    public boolean canHandle(String command) {
        return command.equals(KEEP_FLAT) ||
                command.equals(MOVE_UP) ||
                command.equals(MOVE_DOWN) ||
                command.equals(TURN_LEFT) ||
                command.equals(TURN_RIGHT);
    }
}
