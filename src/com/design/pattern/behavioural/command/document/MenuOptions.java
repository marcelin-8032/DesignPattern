package com.design.pattern.behavioural.command.document;

public class MenuOptions {

    private ActionListenerCommand openCommand;
    private ActionListenerCommand saveCommand;
    private ActionListenerCommand closeCommand;

    void clickOpen() {
        openCommand.execute();
    }

    void clickSave() {
        saveCommand.execute();
    }

    void clickClose() {
        closeCommand.execute();
    }

    public MenuOptions(ActionListenerCommand openCommand,
                       ActionListenerCommand saveCommand, ActionListenerCommand closeCommand) {
        this.openCommand = openCommand;
        this.saveCommand = saveCommand;
        this.closeCommand = closeCommand;
    }
}
