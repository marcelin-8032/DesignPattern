package com.design.pattern.structural.bridge.drawshape;

public class BridgeDrawDemo {
    public static void main(String[] args) {

        var redCircle = new Circle(new RedCircle(), 100, 100, 10);
        var greenCircle = new Circle(new GreenCircle(), 100, 100, 10);

        redCircle.draw();
        greenCircle.draw();

    }
}
