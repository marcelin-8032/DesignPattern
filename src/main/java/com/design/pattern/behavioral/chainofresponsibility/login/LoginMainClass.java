package com.design.pattern.behavioral.chainofresponsibility.login;

import java.io.IOException;

public class LoginMainClass {


    public static void main(String[] args) throws IOException {
        var database = new Database();
        var handler = new UserExistHandler(database)
                .setNextHandler(new ValidPasswordHandler(database))
                .setNextHandler(new RoleCheckHandler());

        var service = new AuthService(handler);
        service.logIn("username", "password");

    }
}
