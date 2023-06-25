package com.design.pattern.behavioral.chainofresponsibility.login;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ValidPasswordHandler extends Handler {

    private Database database;


    public ValidPasswordHandler(Database database) {
        this.database = database;
    }

    @Override
    boolean handle(String username, String password) {

        if (!database.isValidPassword(username, password)) {
            log.info("password is not valid");
            return false;
        }

        return handleNext(username, password);
    }
}
