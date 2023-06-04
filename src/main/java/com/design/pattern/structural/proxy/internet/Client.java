package com.design.pattern.structural.proxy.internet;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client {

    public static void main(String[] args) {
        Internet internet = new ProxyInternet();

        try {
            internet.connectTo("www.google.com");
            //internet.connectTo("abc.com");
        } catch (Exception e) {
            log.info(e.getMessage());
        }
    }
}
