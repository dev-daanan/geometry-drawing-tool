package src.main.java.com.daanan.geometrydrawing.model;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with a radius " + radius);

        System.out.println("""
                                   *** ### ### ***
                               *##                 ##*
                           *##                         ##*
                        *##                               ##*
                      *##                                   ##*
                    *##                                       ##*
                   *##                                         ##*
                  *##                                           ##*
                 *##                                             ##*
                 *##                                             ##*
                 *##                                             ##*
                 *##                                             ##*
                 *##                                             ##*
                  *##                                           ##*
                   *##                                         ##*
                    *##                                       ##*
                      *##                                   ##*
                        *#                                ##*
                           *##                         ##*
                               *##                 ##*
                                   *** ### ### ***
                """);
    }
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
