package com.design.pattern.structural.adapter.rounghole;

import lombok.Getter;

@Getter
public class SquarePegAdapter extends RoundPeg {

    protected SquarePeg peg;

    public SquarePegAdapter(int radius, SquarePeg peg) {
        super(radius);
        this.peg = peg;
    }

    @Override
    public int getRadius() {
        return (int) (peg.getWidth() * Math.sqrt(2) / 2);
    }
    
    public static void main(String[] args) {
        var hole = new RoundHole(5);
        var rpeg = new RoundPeg(5);
        hole.fits(rpeg);

        var small_sqpg = new SquarePeg(5);
        var larg_sqpeg = new SquarePeg(10);

        var small_sqpg_adapter = new SquarePegAdapter(5, small_sqpg);
        var large_sqpg_adapter = new SquarePegAdapter(5, larg_sqpeg);

        System.out.println(hole.fits(small_sqpg_adapter));
        System.out.println(hole.fits(large_sqpg_adapter));
    }
}
