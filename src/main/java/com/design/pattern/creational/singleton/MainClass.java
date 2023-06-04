package com.design.pattern.creational.singleton;

public class MainClass {

    public static void main(String[] args) {

        SingletonClass singletonObject = SingletonClass.getInstance();

        singletonObject.simpleMethod1();

        singletonObject.simpleMethod2();
    }


}
