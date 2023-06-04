package com.design.pattern.structural.bridge.drawshape;

public abstract class Shape {

    DrawAPI drawAPI;

     Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    abstract void draw();
}
