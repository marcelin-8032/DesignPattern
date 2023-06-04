package com.design.pattern.creational.factory.memebership;

public class Member {

    String notify(String message) {
        System.out.println("Notifiying message....");
        return "Message notifier transmitted";
    }


    void print() {
        System.out.println("I am a member of type: " + this.getClass().getTypeName());
    }

}
