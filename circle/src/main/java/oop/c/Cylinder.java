package oop.c;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double r, double h) {
        super(r);
        if (h < 0) {
            this.height = 0;
        } else {
            this.height = h;
        } 
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return super.getArea()*this.height;
    }
    
}
