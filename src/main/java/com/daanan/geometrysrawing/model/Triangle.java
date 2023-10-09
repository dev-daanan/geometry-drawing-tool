package src.main.java.com.daanan.geometrysrawing.model;

public class Triangle extends Shape {
    private double base;
    private double height;
    private double sideA;
    private double sideB;
    private double sideC;

    @Override
    public void draw() {
        System.out.println("Drawing a triangle with base " + base + " and height of " + height);
        System.out.println("""
                              ##
                            ######
                          ##########
                  A     ##############     C
                      ##################
                    ######################
                  ##########################
                ##############################
              ##################################
            ######################################
          ##########################################
        ##############################################
      ##################################################
                               B""");
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }





    // GETTERS AND SETTERS
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
}
