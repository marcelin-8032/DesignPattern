package com.design.pattern.structural.adapter.rounghole;

import lombok.Getter;

@Getter
public class RoundPeg {

    protected int radius;

    public RoundPeg(int radius) {
        this.radius = radius;
    }
}
