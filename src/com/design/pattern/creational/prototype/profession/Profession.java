package com.design.pattern.creational.prototype.profession;

import java.io.Closeable;

abstract class Profession implements Cloneable {

    public int id;
    public String name;

    abstract void print();

    @Override
    protected Object clone() throws CloneNotSupportedException {

            Object clone = null;

            clone = super.clone();

            return clone;

    }
}
