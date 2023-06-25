package com.design.pattern.behavioral.chainofresponsibility.login;


import lombok.extern.slf4j.Slf4j;

@Slf4j
class UserExistHandler extends Handler {
    private Database database;

    public UserExistHandler(Database database) {
        this.database = database;
    }

    @Override
    boolean handle(String username, String password) {

        if (!database.isValidUser(username)) {
            log.info("username is not valid");
            return false;
        }

        return handleNext(username, password);
    }
}
