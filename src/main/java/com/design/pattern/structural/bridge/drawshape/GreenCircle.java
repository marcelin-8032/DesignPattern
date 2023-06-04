package com.design.pattern.structural.bridge.drawshape;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GreenCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        log.info("Drawing Circle[ color:green, radius: "
                + radius + ", x: " + x + ", " + y + "]");
    }
}
