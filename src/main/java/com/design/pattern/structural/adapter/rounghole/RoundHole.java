package com.design.pattern.structural.adapter.rounghole;

import lombok.Getter;

@Getter
public class RoundHole {

    protected int radius;
    public RoundHole(int radius) {
        this.radius = radius;
    }
    boolean fits(RoundPeg peg) {
        return this.getRadius() >= peg.getRadius();
    }
}
