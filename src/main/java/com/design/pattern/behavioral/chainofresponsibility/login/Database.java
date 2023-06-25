package com.design.pattern.behavioral.chainofresponsibility.login;

import java.util.HashMap;
import java.util.Map;

public class Database {

    private final Map<String, String> users;

    public Database() {
        users = new HashMap<>();
        this.users.put("admin_username", "admin_password");
        this.users.put("user_username", "user_password");
    }

    boolean isValidUser(String username) {
        return users.containsKey(username);
    }


    boolean isValidPassword(String username, String password){
        return users.get(username).equals(password);
    }
}
