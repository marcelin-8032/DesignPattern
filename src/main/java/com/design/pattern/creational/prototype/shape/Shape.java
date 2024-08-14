package com.design.pattern.creational.prototype.shape;

import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

@ToString
@NoArgsConstructor
public abstract class Shape implements Cloneable {
    protected int X;
    protected int Y;
    protected String color;

    protected Shape(@NonNull Shape source) {
        this(); // Calls the default constructor (optional in this case)
        this.X = source.X;
        this.Y = source.Y;
        this.color = source.color;
    }

    @Override
    public Shape clone() {
        try {
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Can't happen, since we implement Cloneable
        }
    }
}
