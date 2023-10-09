package src.main.java.com.daanan.geometrysrawing.model;

public class Circle extends Shape {
    private double radius;
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
