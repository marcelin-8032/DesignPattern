package com.design.pattern.creational.prototype.shape;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(@NonNull Rectangle source) {
        super(source);
        this.width = source.width;
        this.height = source.height;
    }

    @Override
    public Rectangle clone() {
        return new Rectangle(this);
    }
}

