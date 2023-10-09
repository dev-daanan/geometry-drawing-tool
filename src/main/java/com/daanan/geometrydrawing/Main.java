package src.main.java.com.daanan.geometrydrawing;

import src.main.java.com.daanan.geometrydrawing.model.Circle;
import src.main.java.com.daanan.geometrydrawing.model.Rectangle;
import src.main.java.com.daanan.geometrydrawing.model.Shape;
import src.main.java.com.daanan.geometrydrawing.model.Triangle;
import src.main.java.com.daanan.geometrydrawing.util.ShapeDrawer;

public class Main {
    public static void main(String[] args) {
        ShapeDrawer shapeDrawer = new ShapeDrawer();
        Shape circle = new Circle(3.14);
        Shape rectangle = new Rectangle(4, 8);
        Shape triangle = new Triangle(6, 6, 4, 4, 4);

        shapeDrawer.drawShape(circle);
        shapeDrawer.displayArea(circle);
        shapeDrawer.displayPerimeter(circle);
    }
}
