package com.design.pattern.creational.factory.memebership;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Member {

    String notify(String message) {
        log.info("Notifiying message....");
        return "Message notifier transmitted";
    }


    void print() {
        log.info("I am a member of type: " + this.getClass().getTypeName());
    }

}
