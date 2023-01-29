package com.designpattern.creational.factory;

 class Doctor implements Profession {
    @Override
    public void print() {
        System.out.println("In print Doctor class");
    }
}
