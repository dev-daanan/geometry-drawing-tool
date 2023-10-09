package src.main.java.com.daanan.geometrydrawing.model;

public class Rectangle extends Shape {
    private double height;
    private double length;

    public Rectangle(double height, double length) {
        this.height = height;
        this.length = length;
    }

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
