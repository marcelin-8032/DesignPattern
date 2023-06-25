package com.design.pattern.behavioral.chainofresponsibility.login;

public class AuthService {

    private final Handler handler;


    public AuthService(Handler handler) {
        this.handler = handler;
    }


    boolean logIn(String email, String password) {
        if (handler.handle(email, password)) {
            return true;
        }
        return false;
    }
}
