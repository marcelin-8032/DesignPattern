package com.design.pattern.behavioral.chainofresponsibility.login;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RoleCheckHandler extends Handler {

    @Override
    boolean handle(String username, String password) {

        if ("admin_username".equals(username)) {
            return true;
        }

        return handleNext(username, password);
    }
}
