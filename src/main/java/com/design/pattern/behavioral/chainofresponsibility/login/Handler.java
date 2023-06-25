package com.design.pattern.behavioral.chainofresponsibility.login;

abstract class Handler {
    private Handler next;

    Handler setNextHandler(Handler next) {
        this.next = next;
        return next;
    }

    abstract boolean handle(String username, String password);

    boolean handleNext(String username, String password) {
        if (next == null) {
            return true;
        }
        return next.handle(username, password);
    }

}
