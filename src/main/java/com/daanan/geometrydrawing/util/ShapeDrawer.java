package src.main.java.com.daanan.geometrydrawing.util;

import src.main.java.com.daanan.geometrydrawing.model.Shape;

public class ShapeDrawer {

    public void drawShape(Shape shape) {
        shape.draw();
    }

    public void displayArea(Shape shape) {
        System.out.println("Area: " + shape.area());
    }

    public void displayPerimeter(Shape shape) {
        System.out.println("Perimeter: " + shape.perimeter());
    }

}
