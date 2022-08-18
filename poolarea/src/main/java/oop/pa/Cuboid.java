package oop.pa;

public class Cuboid extends Rectangle {
    private double height;

    public Cuboid(double w, double l, double h) {
        super(w, l);
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
