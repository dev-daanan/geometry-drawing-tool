package src.main.java.com.daanan.geometrysrawing.model;

public class Rectangle extends Shape {
    private double height;
    private double length;

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with length " + length + " and height of " + height);
        System.out.println("""
                ####################################################
                #                                                  #
                #                                                  #
                #                                                  #
                #                                                  #
                #                                                  #
                ####################################################
                """);
    }

    @Override
    public double area() {
        return height * length;
    }

    @Override
    public double perimeter() {
        return 2 * height + 2 * length;
    }
}
