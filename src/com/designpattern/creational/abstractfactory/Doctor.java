package com.designpattern.creational.abstractfactory;

 class Doctor implements Profession {
    @Override
    public void print() {
        System.out.println("In print Doctor class");
    }
}
