package com.design.pattern.creational.singleton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public final class SingletonClass {

    private static volatile SingletonClass instance = null;

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {

        if (SingletonClass.instance == null) {
            synchronized (SingletonClass.class) {
                if (SingletonClass.instance == null) {
                    SingletonClass.instance = new SingletonClass();
                }
            }

        }
        return SingletonClass.instance;
    }

    public void simpleMethod1() {
        log.info("Print simple method 1");
    }

    public void simpleMethod2() {
        log.info("Print simple method 2");
    }
}
