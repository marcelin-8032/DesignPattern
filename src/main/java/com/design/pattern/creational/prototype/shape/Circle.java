package com.design.pattern.creational.prototype.shape;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class Circle extends Shape {
    private int radius;

    public Circle(Circle source) {
        super(source); // Call the parent class's copy constructor
        if (source != null) {
            this.radius = source.radius;
        }
    }

    // Implementing the clone method
    @Override
    public Circle clone() {
        return new Circle(this); // Return a new Circle using the copy constructor
    }
}