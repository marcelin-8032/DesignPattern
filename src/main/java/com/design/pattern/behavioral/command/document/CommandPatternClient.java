package com.design.pattern.behavioral.command.document;

public class CommandPatternClient {


    public static void main(String[] args) {
        var doc = new Document();

        var clickOpen = new ActionOpen(doc);
        var clickSave = new ActionSave(doc);
        var clickClose = new ActionClose(doc);

        MenuOptions menu = new MenuOptions(clickOpen, clickSave, clickClose);

        menu.clickOpen();
        menu.clickSave();
        menu.clickClose();
    }


}
