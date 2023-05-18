package com.design.pattern.creational.abstractfactory;

 class Doctor implements Profession {
    @Override
    public void print() {
        System.out.println("In print Doctor class");
    }
}
