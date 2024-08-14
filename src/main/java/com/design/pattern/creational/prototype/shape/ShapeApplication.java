package com.design.pattern.creational.prototype.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeApplication {
    private List<Shape> shapes;

    // Constructor
    public ShapeApplication() {
        shapes = new ArrayList<>();

        // Create and add a Circle object to the shapes list
        Circle circle = new Circle();
        circle.X = 10;
        circle.Y = 10;
        circle.setRadius(20); // Using setter for radius
        shapes.add(circle);

        // Clone the circle and add it to the shapes list
        Circle anotherCircle = circle.clone();
        shapes.add(anotherCircle);

        // Create and add a Rectangle object to the shapes list
        Rectangle rectangle = new Rectangle();
        rectangle.X = 10;
        rectangle.Y = 10;
        rectangle.color = "red";
        rectangle.setWidth(10);  // Using setter for width
        rectangle.setHeight(20); // Using setter for height
        shapes.add(rectangle);

        Rectangle anotherRectangle = rectangle.clone();
        shapes.add(anotherRectangle);

    }

    // Business logic method
    public void businessLogic() {
        // Create a copy of the shapes list
        List<Shape> shapesCopy = new ArrayList<>();

        // Clone each shape in the shapes list and add it to shapesCopy
        for (Shape s : shapes) {
            shapesCopy.add(s.clone());
        }

        System.out.println(shapesCopy);
        // Now shapesCopy contains clones of all the shapes in the original list
    }

    public static void main(String[] args) {
        ShapeApplication app = new ShapeApplication();
        app.businessLogic();

    }
}
