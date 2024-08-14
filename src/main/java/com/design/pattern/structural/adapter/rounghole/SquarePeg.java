package com.design.pattern.structural.adapter.rounghole;

import lombok.Getter;

@Getter
public class SquarePeg {

    protected  int width;

    public SquarePeg(int width) {
        this.width = width;
    }
}
