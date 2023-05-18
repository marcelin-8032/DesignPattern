package com.design.pattern.behavioural.command.airplane;

public interface ICommandController {

    void execute(String command);

    boolean canHandle(String command);
}
